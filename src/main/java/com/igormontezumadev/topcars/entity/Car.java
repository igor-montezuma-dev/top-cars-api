package com.igormontezumadev.topcars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    private Date ano;
    private Double valor;
    private String combustivel;
    private Integer num_portas;
    private Timestamp timestamp_cadastro;



    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Model model;
}
