package com.rodolfobrandao.swaggerautomaticannotation.controller;

import com.rodolfobrandao.swaggerautomaticannotation.config.swagger.DefaultOperation;
import com.rodolfobrandao.swaggerautomaticannotation.service.ClientService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/find")
    @DefaultOperation(summary = "Buscar", description = "Buscar cliente pelo nome", tags = {"Cliente"}, parameters = {
            @Parameter(name = "nome", description = "Nome do cliente", example = "Rodolfo", required = true)
    })
    public String findClient(@Parameter(description = "Nome do cliente") String nome) {
        return clientService.buscarCliente(nome);
    }

}
