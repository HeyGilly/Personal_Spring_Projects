package com.example.roomweb.controllers;

import com.example.roomweb.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

//        Creating fake data
//        just a for loop that an array list.
    private static final List<Room> rooms = new ArrayList<>();
    static{
        for(int X=1;X<=10;X++){
            rooms.add(new Room(X, "Room" + X, "X"+X, "This is the Story everyone has"));
        }
    }

    @GetMapping
    // Creating a method that takes in a  Model Element
    public String getAllRooms(Model model){
        // "rooms" matches our view  ,  rooms is the array from above
        model.addAttribute("rooms", rooms);
        // this is the name of the view we want to return too
        return "rooms";

    }


}
