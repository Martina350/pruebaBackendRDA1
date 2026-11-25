package com.puce.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puce.prueba.service.VideojuegoService;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {
    private VideojuegoService videojuegoService;

    public VideojuegoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
}
