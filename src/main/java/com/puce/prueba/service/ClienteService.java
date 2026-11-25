package com.puce.prueba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.puce.prueba.models.Cliente;
import com.puce.prueba.repository.ClienteRepository;

@Service
public class ClienteService {
    public ClienteRepository clienteRepository;

    private ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
