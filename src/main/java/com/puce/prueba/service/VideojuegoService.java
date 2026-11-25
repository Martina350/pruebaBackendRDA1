package com.puce.prueba.service;

import org.springframework.stereotype.Service;

import com.puce.prueba.repository.VideojuegoRepository;

@Service 
public class VideojuegoService {
    public VideojuegoRepository videojuegoRepository;

    private VideojuegoService(VideojuegoRepository videojuegoRepository){
        this.videojuegoRepository = videojuegoRepository;
    }
    
}
