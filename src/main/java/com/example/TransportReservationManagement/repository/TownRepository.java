package com.example.TransportReservationManagement.repository;

import com.example.TransportReservationManagement.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town, String> {
    Town getById(String id);
}
