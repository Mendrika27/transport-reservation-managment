package com.example.TransportReservationManagement.repository;

import com.example.TransportReservationManagement.model.Offer;
import com.example.TransportReservationManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, String> {
    Offer getById (String id);
}
