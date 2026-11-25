package com.puce.prueba.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.puce.prueba.models.Videojuego;
import com.puce.prueba.service.VideojuegoService;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {
    private VideojuegoService videojuegoService;

    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @GetMapping
    public List<Videojuego> getAllVideojuegos() {
        return videojuegoService.getAllVideojuegos();
    }

    @PostMapping("/crear")
    public ResponseEntity<Videojuego> createVideojuego(@RequestBody Videojuego videojuego) {
    Videojuego createdVideojuego = videojuegoService.createVideojuego(videojuego);
        return new ResponseEntity<>(createdVideojuego, HttpStatus.CREATED);
    }

    @GetMapping("/precio")
    public List<Videojuego> listarPorRangoPrecio(@RequestParam double min, @RequestParam double max) {
        return videojuegoService.listarPorRangoPrecio(min, max);
    }
}
