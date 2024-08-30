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

    public List<String> ListarClientes() {
        List<String> clientes = Arrays.asList("Julio", "Maria", "João", "Pedro");
        return clientes;
    }

}
