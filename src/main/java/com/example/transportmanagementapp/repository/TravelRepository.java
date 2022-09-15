package com.example.transportmanagementapp.repository;

import com.example.transportmanagementapp.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, String> {
}
