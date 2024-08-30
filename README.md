### 🌟 Swagger Automatic Annotation for Spring Boot
Este projeto oferece uma configuração automática de anotações Swagger para documentar APIs de projetos Spring Boot, simplificando a documentação e melhorando a clareza da sua API.

### 📜 Descrição
Utilize as classes e anotações fornecidas para configurar automaticamente informações de documentação para endpoints de APIs em seu projeto Spring Boot.

### 🛠️ Dependências
Adicione as seguintes dependências ao seu projeto:

```gradle

// SpringDoc for OpenAPI
implementation "org.springdoc:springdoc-openapi-starter-common:${springdocVersion}"
implementation "org.springdoc:springdoc-openapi-starter-webmvc-ui:${springdocVersion}"
```
// AspectJ para AOP
implementation 'org.aspectj:aspectjweaver:1.9.7'
### 🚀 Como Usar
Adicione as dependências: Inclua as dependências do Swagger e AspectJ no seu projeto Spring Boot.
Use a anotação @DefaultOperation: Adicione a anotação aos métodos dos seus controladores para gerar documentação automaticamente.
### 📚 Exemplo
No controlador:

```java
package com.rodolfobrandao.swaggerautomaticannotation.controller;

import com.rodolfobrandao.swaggerautomaticannotation.config.swagger.DefaultOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
public class ExampleController {

    @DefaultOperation(summary = "Listar", description = "Listar clientes", tags = {"Cliente"})
    @GetMapping("/list")
    public String listClients() {
        // Implementação
        return "List of clients";
    }
}
```
### 🔒 Configuração de Segurança
Se estiver utilizando o Spring Security, permita o acesso ao Swagger adicionando a seguinte configuração:

```java
@Override
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
.anyRequest().authenticated();
}
```
### 🤝 Contribuição
Sinta-se à vontade para enviar pull requests com melhorias e correções. Sua contribuição é muito bem-vinda!

📜 Licença
Este projeto está licenciado sob a Licença MIT.
