package com.example.TransportReservationManagement.service;

import com.example.TransportReservationManagement.model.Travel;
import com.example.TransportReservationManagement.repository.TravelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TravelService {
    private final TravelRepository travelRepository;

    public Travel getById(String travelId) {
        return travelRepository.getById(travelId);
    }

    public Optional<Travel> getOffer(String offer){
        return travelRepository.findById(offer);
    }

    public List<Travel> saveAll(List<Travel> travels) {
        return travelRepository.saveAll(travels);
    }

    public Travel deleteById(int id){
        return travelRepository.deleteById(id);
    }
}
