package com.example.TransportReservationManagement.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "\"offer\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Offer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long tariff;

    @Enumerated(EnumType.STRING)
    private Label offerLabel;

    public enum Label{
        Lite, Premium
    }
}

