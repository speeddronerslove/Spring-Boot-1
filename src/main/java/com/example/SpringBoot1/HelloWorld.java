package com.example.SpringBoot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    String printer () {
    return "Yenna Paakura";
    }

}
