package com.example.transportmanagementapp.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "\"travel\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Travel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    //@OneToMany
    @JoinColumn(name= "town_id")
    private Town start;

    //@OneToMany
    @JoinColumn(name= "town_id")
    private Town finish;
}
