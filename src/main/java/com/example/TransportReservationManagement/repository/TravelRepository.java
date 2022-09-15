package com.example.TransportReservationManagement.repository;

import com.example.TransportReservationManagement.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface TravelRepository extends JpaRepository<Travel, String> {
    Travel getById(String travelId);
    Travel deleteById(int id);
}
