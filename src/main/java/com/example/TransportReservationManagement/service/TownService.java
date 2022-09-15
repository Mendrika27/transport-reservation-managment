package com.example.TransportReservationManagement.service;


import com.example.TransportReservationManagement.model.Offer;
import com.example.TransportReservationManagement.model.Town;
import com.example.TransportReservationManagement.repository.TownRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class TownService {
    public final TownRepository townRepository;

    public Town getById(String id){
        return townRepository.getById(id);
    }
    public List<Town> saveAll(List<Town> towns) {
        return townRepository.saveAll(towns);
    }
}
