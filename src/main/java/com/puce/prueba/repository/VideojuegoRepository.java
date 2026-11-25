package com.puce.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.prueba.models.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {

}
