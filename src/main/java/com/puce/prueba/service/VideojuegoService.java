package com.puce.prueba.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.puce.prueba.models.Videojuego;
import com.puce.prueba.repository.VideojuegoRepository;

@Service 
public class VideojuegoService {
    public VideojuegoRepository videojuegoRepository;

    private VideojuegoService(VideojuegoRepository videojuegoRepository){
        this.videojuegoRepository = videojuegoRepository;
    }
    
    public List<Videojuego> getAllVideojuegos() {
        return videojuegoRepository.findAll();
    }

    public Videojuego createVideojuego(Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    public List<Videojuego> listarPorRangoPrecio(double min, double max) {
        List<Videojuego> videojuegos = videojuegoRepository.findAll();
        List<Videojuego> resultado = new ArrayList<>();

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getPrecio() >= min && videojuego.getPrecio() <= max) {
                resultado.add(videojuego);
            }
        }

        return resultado;
    }
}
