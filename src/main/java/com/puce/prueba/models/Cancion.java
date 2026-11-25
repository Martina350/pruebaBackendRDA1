package com.puce.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity 
@Data
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cancion_id")
    private int id;
    @Column (name = "titulo")
    private String titulo;
    @Column (name = "artista")
    private String artista;
    @Column (name = "album")
    private String album;
    @Column (name = "genero")
    private String genero;
    @Column (name = "duracion_segundos")
    private double duracionSegundos;
}
