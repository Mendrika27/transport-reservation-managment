package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.Offer;
import com.example.TransportReservationManagement.service.OfferService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OfferController {
    private final OfferService offerService;

    @GetMapping("/offers")
    public Offer getLabel(Offer label){
        Offer offers = new Offer();
        offers.setTariff(label.getTariff());
        return offers;
    }

    @GetMapping("/offers/{id}")
    public Offer getById(@PathVariable String id){
        return offerService.getById(id);
    }
}
