package com.example.transportmanagementapp.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "\"reservation\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @CreatedDate
    private Instant reservationDate;

    private int place;

    private int paidAmount;

    @JoinColumn(name = "user_id")
    private User user;


    @JoinColumn(name = "trip_id")
    private Travel trip;
}
