package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.Reservation;
import com.example.TransportReservationManagement.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping("/reservation/{id}")
    public Optional<Reservation> getReservation(@PathVariable String id){
        return reservationService.getById(id);
    }


    @PutMapping("/reservation")
    public List<Reservation> book (@RequestBody List<Reservation> newReservation){
        return reservationService
                .saveAll((List<Reservation>) newReservation.stream());
    }
    @DeleteMapping("/cancel/{id}")
    public Reservation CancelReservation(@PathVariable int id){
        return reservationService.deleteById(id);
    }
}
