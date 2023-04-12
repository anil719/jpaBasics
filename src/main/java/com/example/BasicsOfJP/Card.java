package com.example.BasicsOfJP;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cardInfo")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cardNo;
    Date expiry;

    @Enumerated(EnumType.STRING)
    Status status ;


    @OneToOne
    @JoinColumn
    User user;

}
