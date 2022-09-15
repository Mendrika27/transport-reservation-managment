package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.Town;
import com.example.TransportReservationManagement.model.User;
import com.example.TransportReservationManagement.service.TownService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TownController {
    private TownService townService;

    @GetMapping("/towns/{id}")
    public String getById(@PathVariable String id){
        return townService.getById(id).toString();
    }

    @PutMapping("/towns")
    public List<Town> createUser(@RequestBody List<Town> newTown){
        return townService
                .saveAll((List<Town>) newTown.stream());
    }
}
