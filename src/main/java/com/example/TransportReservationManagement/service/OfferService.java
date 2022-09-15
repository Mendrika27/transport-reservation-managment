package com.example.TransportReservationManagement.service;

import com.example.TransportReservationManagement.model.Offer;
import com.example.TransportReservationManagement.model.Travel;
import com.example.TransportReservationManagement.repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OfferService {
    private final OfferRepository offerRepository;

    public Offer getById(String id) {
        return offerRepository.getById(id);
    }

    public Optional<Offer> getByLabel(String name){
        return offerRepository.findById(name);
    }

    public List<Offer> saveAll(List<Offer> offers) {
        return offerRepository.saveAll(offers);
    }
}
