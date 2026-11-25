package com.puce.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity 
@Data
public class Cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cliente_id")
    private int id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "correo")
    private String correo;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "edad")
    private int edad;
    
}
