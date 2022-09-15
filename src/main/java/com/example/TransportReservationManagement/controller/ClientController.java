package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.User;
import com.example.TransportReservationManagement.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toUnmodifiableList;

@RestController
@AllArgsConstructor
public class ClientController {
    private final UserService userService;

    @GetMapping("/clients/{id}")
    public List<User> getClientById(@PathVariable String id){
        User client = new User();
        if (client.getRole() == User.Role.CLIENTS)
            userService.getById(id);
        return (List<User>) client;
    }

    @PutMapping("/client")
    public List<User> createUser(@RequestBody List<User> newUser){
        return userService
                .saveAll((List<User>) newUser.stream());
    }
}
