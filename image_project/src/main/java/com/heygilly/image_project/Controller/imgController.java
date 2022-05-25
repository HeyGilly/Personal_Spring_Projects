package com.heygilly.image_project.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class imgController {

    @RequestMapping(value="/sid", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public void getIMage(HttpServletResponse response) throws IOException{

        // get the image resource and write it directly to the response object.
        var imgFile = new ClassPathResource("image/sid.jpg");

        //We get the image resource from the classpath
        // (src/main/resources directory is in the Java classpath) with the ClassPathResource.
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);

        //The content type of the response is set to the MediaType.IMAGE_JPEG_VALUE.
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }
}
