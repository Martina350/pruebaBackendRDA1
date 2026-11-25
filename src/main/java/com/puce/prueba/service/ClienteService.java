package com.puce.prueba.service;

import java.util.ArrayList;
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

    public List<Cliente> listarPorCiudad(String nombre) {
        List<Cliente> clientes = clienteRepository.findAll();
        List<Cliente> resultado = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente.getCiudad().equalsIgnoreCase(nombre)) {
                resultado.add(cliente);
            }
        }

        return resultado;
    }
}
