package com.example.TransportReservationManagement.repository;

import com.example.TransportReservationManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    User getById (String id);

    List<User> findByRoleAndFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(User.Role role, String firstName, String lastName);

}

