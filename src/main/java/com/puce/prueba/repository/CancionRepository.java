package com.puce.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.prueba.models.Cancion;

public interface CancionRepository extends JpaRepository<Cancion, Integer> {

}
