package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    ResponseEntity<?> homePage(){
        return ResponseEntity.ok("homePage");
    }
    @GetMapping("/redirect")
    ResponseEntity<?> redirectPage(){
       return ResponseEntity.ok("redirectPage");
    }

}
