🌟 Swagger Automatic Annotation for Spring Boot
This project provides automatic Swagger annotation configuration to document APIs for Spring Boot projects, streamlining documentation and enhancing the clarity of your API.

### Acess browser
Acess in browser http://localhost:8081/swagger-ui/index.html#/

Project Features
HotReload with Spring Boot DevTools: Automatically reloads your application when changes are made.
Swagger Documentation: Easily integrate Swagger to document your API endpoints.
Custom Annotation: A specially created annotation to simplify and standardize your API documentation.
<div align="center"> <img src="https://github.com/RodolfoBrandaoOficial/Swagger-Automatic-Annotation/blob/main/srcGitHub/autodocanotation.png?raw=true" width="700px" /> </div>
📜 Description
Utilize the provided classes and annotations to automatically configure documentation for API endpoints in your Spring Boot project.

🛠️ Dependencies
Add the following dependencies to your project:

```gradle
    // SpringDoc for OpenAPI
    implementation "org.springdoc:springdoc-openapi-starter-common:${springdocVersion}"
    implementation "org.springdoc:springdoc-openapi-starter-webmvc-ui:${springdocVersion}"
    // AspectJ for AOP
    implementation 'org.aspectj:aspectjweaver:1.9.7'
```

### 🚀 Como Usar
Adicione as dependências: Inclua as dependências do Swagger e AspectJ no seu projeto Spring Boot.
Use a anotação @DefaultOperation: Adicione a anotação aos métodos dos seus controladores para gerar documentação automaticamente.

### 📚 Exemplo
No controlador:
=======
🚀 How to Use
Add Dependencies: Include the Swagger and AspectJ dependencies in your Spring Boot project.
Use the @DefaultOperation Annotation: Add the annotation to your controller methods to automatically generate documentation.

📚 Example
In your controller:
    @DefaultOperation(summary = "List clients", description = "Retrieve a list of all clients", tags = {"Client"})

```java
package com.rodolfobrandao.swaggerautomaticannotation.controller;

import com.rodolfobrandao.swaggerautomaticannotation.config.swagger.DefaultOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
public class ExampleController {

    @DefaultOperation(summary = "List clients", description = "Retrieve a list of all clients", tags = {"Client"})
    @GetMapping("/list")
    public String listClients() {
        // Implementation
        return "List of clients";
    }
}
```
🔒 Security Configuration
If using Spring Security, allow access to Swagger by adding the following configuration:

```java
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
        .anyRequest().authenticated();
}
```
🤝 Contribution
Feel free to submit pull requests with improvements and fixes. Your contributions are highly appreciated!

📜 License
This project is licensed under the MIT License.
