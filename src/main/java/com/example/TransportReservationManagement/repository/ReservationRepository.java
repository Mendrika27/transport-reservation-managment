package com.example.TransportReservationManagement.repository;

import com.example.TransportReservationManagement.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

    Reservation deleteById(int id);
}
