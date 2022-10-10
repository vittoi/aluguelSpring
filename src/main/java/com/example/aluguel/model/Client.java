package com.example.aluguel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.sql.Timestamp;
@Getter
@Setter
@Table(name = "clients")
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private Boolean isActive;
    private Timestamp createdAt;
    private Timestamp lastLogon;
    //list de items??

    public Client() {
    }

    public Client(Long id, String nome, Boolean isActive, Timestamp createdAt, Timestamp lastLogon) {
        this.id = id;
        this.nome = nome;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.lastLogon = lastLogon;
    }
}
