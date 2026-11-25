package com.puce.prueba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puce.prueba.service.CancionService;

@RestController 
@RequestMapping ("/api/canciones")
public class CancionController {
    private CancionService cancionService;

    public CancionController (CancionService cancionService){
        this.cancionService = cancionService;
    }
}
