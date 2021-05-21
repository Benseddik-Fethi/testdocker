package com.example.testdocker.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utilisateur_id")
    private int id;
    private String nom;
    private String prenom;

}
