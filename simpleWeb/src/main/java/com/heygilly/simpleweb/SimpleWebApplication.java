package com.heygilly.simpleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



// A convenience annotation that adds:
    // Configuration, EnableAutoConfiguration, ComponentScan
@SpringBootApplication
public class SimpleWebApplication {

    public static void main(String[] args) {
        // a method to launch an application
        SpringApplication.run(SimpleWebApplication.class, args);
    }
}
