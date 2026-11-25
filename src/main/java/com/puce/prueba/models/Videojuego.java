package com.puce.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videojuego_id")
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "plataforma")
    private String plataforma;

    @Column(name = "clasificacion")
    private String clasificacion;

    @Column(name = "precio")
    private double precio;

    @Column(name = "anio_lanzamiento")
    private int anioLanzamiento;
}
