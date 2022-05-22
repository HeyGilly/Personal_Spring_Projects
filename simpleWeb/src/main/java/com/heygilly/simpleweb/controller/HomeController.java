package com.heygilly.simpleweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest Controller is a combination of Controller and Response Baby
//also tells Spring MVC to write the text directly into the HTTP response body,
@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Welcome to Home Page!";
    }
}
