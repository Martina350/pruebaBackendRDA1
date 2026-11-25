package com.puce.prueba.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.puce.prueba.models.Cancion;
import com.puce.prueba.service.CancionService;

@RestController 
@RequestMapping ("/api/canciones")
public class CancionController {
    private CancionService cancionService;

    public CancionController (CancionService cancionService){
        this.cancionService = cancionService;
    }
    @GetMapping
    public List<Cancion> getAllCanciones() {
        return cancionService.getAllCanciones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cancion> getCancionById(@PathVariable int id) {
        return cancionService.getCancionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crear")
    public ResponseEntity<Cancion> createCancion(@RequestBody Cancion cancion) {
    Cancion createdCancion = cancionService.createCancion(cancion);
        return new ResponseEntity<>(createdCancion, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cancion> updateCancion(@PathVariable int id, @RequestBody Cancion cancionUpdated) {
        return cancionService.updateCancion(id, cancionUpdated)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteCancion(@PathVariable int id) {
        if (cancionService.deleteCancion(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/conteo")
    public int contarPorGenero(@RequestParam String genero) {
        return cancionService.contarPorGenero(genero);
    }
}
