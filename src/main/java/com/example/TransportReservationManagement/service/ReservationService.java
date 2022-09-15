package com.example.TransportReservationManagement.service;

import com.example.TransportReservationManagement.model.Reservation;
import com.example.TransportReservationManagement.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public Optional<Reservation> getById (String id){
        return reservationRepository.findById(id);
    }

    public List<Reservation> saveAll(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }
    public Reservation deleteById(int id){
        return reservationRepository.deleteById(id);
    }
}
