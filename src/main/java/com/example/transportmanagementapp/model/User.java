package com.example.transportmanagementapp.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "\"user\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String cin;

    private String contact;

    @Enumerated(EnumType.STRING)
    private Role role;
    public enum Role{
        CLIENTS, ADMIN
    }

}
