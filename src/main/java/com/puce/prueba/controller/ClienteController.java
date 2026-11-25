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

import com.puce.prueba.models.Cliente;
import com.puce.prueba.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
    Cliente createdCliente = clienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @GetMapping("/ciudad")
    public List<Cliente> listarPorCiudad(@RequestParam String nombre) {
        return clienteService.listarPorCiudad(nombre);
    }
}
