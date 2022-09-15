package com.example.transportmanagementapp.repository;

import com.example.transportmanagementapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, String> {
    User getById (String id);

    List<User>  getByCin (String cin);

    List<User> findByRoleContainingIgnoreCaseAndFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(String role, String firstName, String lastName);

}
