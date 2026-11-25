package com.puce.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.puce.prueba.models.Cancion;
import com.puce.prueba.repository.CancionRepository;

@Service 
public class CancionService {
    public CancionRepository cancionRepository;

    private CancionService(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    public List<Cancion> getAllCanciones() {
        return cancionRepository.findAll();
    }

    public Optional<Cancion> getCancionById(int id) {
        return cancionRepository.findById(id);
    }

    public Cancion createCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    public Optional<Cancion> updateCancion(int id, Cancion cancionUpdated) {
        return cancionRepository.findById(id).map(cancion -> {
            cancion.setTitulo(cancionUpdated.getTitulo());
            cancion.setArtista(cancionUpdated.getArtista());
            cancion.setAlbum(cancionUpdated.getAlbum());
            cancion.setGenero(cancionUpdated.getGenero());
            cancion.setDuracionSegundos(cancionUpdated.getDuracionSegundos());
            return cancionRepository.save(cancion);
        });
    }

    public boolean deleteCancion(int id) {
        if (cancionRepository.existsById(id)) {
            cancionRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public int contarPorGenero(String genero) {
        List<Cancion> canciones = cancionRepository.findAll();
        int contar = 0;

        for (Cancion cancion : canciones) {
            if (cancion.getGenero().equalsIgnoreCase(genero)) {
                contar++;
            }
        }

        return contar;
    }
}
