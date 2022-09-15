package com.example.transportmanagementapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {
    @GetMapping("/trip")
    public String hello (){
        return "Voyagez ici !";
    }
}
