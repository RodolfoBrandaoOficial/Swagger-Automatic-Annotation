package com.rodolfobrandao.swaggerautomaticannotation.controller;

import com.rodolfobrandao.swaggerautomaticannotation.config.swagger.DefaultOperation;
import com.rodolfobrandao.swaggerautomaticannotation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * OpenApiConfig
 * Auto Doc Swagger
 * Github-RodolfoBrandaoOficial
 * RodolfoBrandaoOficial/Swagger-Automatic-Annotation
 */
@RestController
@RequestMapping("/api/v1/client")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/list")
    @DefaultOperation(summary = "Listar", description = "Listar clientes", tags = {"Cliente"})
    public String listClients() {
        return clientService.ListarClientes().toString();
    }

}
