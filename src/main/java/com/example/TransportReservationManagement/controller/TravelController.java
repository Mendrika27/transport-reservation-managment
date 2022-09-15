package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.Travel;
import com.example.TransportReservationManagement.model.User;
import com.example.TransportReservationManagement.service.TravelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toUnmodifiableList;

@RestController
public class TravelController {
    private TravelService travelService;

    @GetMapping("/trip")
    public Optional<Travel> getTripByOffer (String label){
        return travelService.getOffer(label);
    }

    @GetMapping("/trip/{id}")
    public Travel getById(@PathVariable String id){
        return travelService.getById(id);
    }

    @PutMapping("/travel")
    public List<Travel> createUser(@RequestBody List<Travel> newTrip){
        return travelService
                .saveAll(newTrip);
    }
    @DeleteMapping("/cancel")
    public Travel CancelTrip(@PathVariable int id){
        return travelService.deleteById(id);
    }
}
