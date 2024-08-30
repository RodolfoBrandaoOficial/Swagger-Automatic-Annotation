package com.rodolfobrandao.swaggerautomaticannotation.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * OpenApiConfig
 * Auto Doc Swagger
 * Github-RodolfoBrandaoOficial
 * RodolfoBrandaoOficial/Swagger-Automatic-Annotation
 */
@Configuration
public class OpenApiConfig {
    /**
     * O pacote base dos controladores.
     * <p>
     *     O pacote base dos controladores é usado para interceptar os métodos dos controladores
     *     e processar e definir valores padrão das anotações de operação do Swagger.
     *     <br>
     *     Exemplo: com.rodolfobrandao.swaggerautomaticannotation.controller
     *     <br>
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Sistema de documentação de API")
                        .version("0.0.1")
                        .description("Documentação da API feito por @RodolfoBrandaoOficial")
                        .summary("(C) 2024 Rodolfo Brandão")
                        .termsOfService("https://github.com/RodolfoBrandaoOficial")
                        .contact(new Contact()
                                .name("Rodolfo Brandão")
                                .url("https://github.com/RodolfoBrandaoOficial")
                                .email("rodolfo@rodolfobrandao.com.br"))
                        .license(new License()
                                .name("Licença")
                                .url("https://github.com/RodolfoBrandaoOficial")))
                .addServersItem(new Server().url("http://localhost:8080")
                        .description("Servidor de desenvolvimento"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                                .description("Token JWT para autenticação")))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"));
    }


}
