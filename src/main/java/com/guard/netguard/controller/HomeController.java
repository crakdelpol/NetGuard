package com.guard.netguard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"","home"})
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping(value = "dashboard")
    public ResponseEntity<String> dashboard(){
        return ResponseEntity.ok("Private Page");
    }

}
