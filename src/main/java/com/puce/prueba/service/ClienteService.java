package com.puce.prueba.service;

import org.springframework.stereotype.Service;

import com.puce.prueba.repository.ClienteRepository;

@Service
public class ClienteService {
    public ClienteRepository clienteRepository;

    private ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
