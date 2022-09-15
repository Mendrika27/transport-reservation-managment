package com.example.TransportReservationManagement.service;


import com.example.TransportReservationManagement.model.User;
import com.example.TransportReservationManagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getById(String userId) {
        return userRepository.getById(userId);
    }

    public List<User> saveAll(List<User> users) {
        return userRepository.saveAll(users);
    }
    public List<User> getByCriteria(
            User.Role role, String firstName, String lastName) {
        return userRepository
                .findByRoleAndFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCase(
                        role, firstName, lastName);
    }

}
