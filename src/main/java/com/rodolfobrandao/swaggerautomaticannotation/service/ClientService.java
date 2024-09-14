package com.rodolfobrandao.swaggerautomaticannotation.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
/**
 * OpenApiConfig
 * Auto Doc Swagger
 * Github-RodolfoBrandaoOficial
 * RodolfoBrandaoOficial/Swagger-Automatic-Annotation
 */
@Service
public class ClientService {

    List<String> clientes = Arrays.asList("Rodolfo", "Maria", "João", "José", "Ana");

    public List<String> ListarClientes() {
        return clientes;
    }

    public String buscarCliente(String nome) {
        return clientes.stream().filter(cliente -> cliente.contains(nome)).findFirst().orElse("Cliente não encontrado");
    }
}
