package com.puce.prueba.service;

import org.springframework.stereotype.Service;

import com.puce.prueba.repository.CancionRepository;

@Service 
public class CancionService {
    public CancionRepository cancionRepository;

    private CancionService(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }
}
