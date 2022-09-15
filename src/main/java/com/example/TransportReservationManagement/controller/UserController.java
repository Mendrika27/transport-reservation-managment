package com.example.TransportReservationManagement.controller;

import com.example.TransportReservationManagement.model.User;
import com.example.TransportReservationManagement.security.PrincipalUSer;
import com.example.TransportReservationManagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    @GetMapping("/users")
    public User getUser(PrincipalUSer principal){
        User users = new User();
        users.setRole(User.Role.valueOf(principal.getRole()));

        return users;
    }

}
