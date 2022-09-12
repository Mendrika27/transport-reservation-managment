package com.example.transportmanagementapp.service;

import com.example.transportmanagementapp.endpoint.User;
import com.example.transportmanagementapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getById(String userId){
        return userRepository.getById(userId);
    }

    public List<User> getByCin(String cin){
        return userRepository.getByCin(cin);
    }

    public List<User> saveAll(List<User> users) {
        return userRepository.saveAll(users);
    }
}
