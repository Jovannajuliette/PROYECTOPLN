/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pln.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author alond
 */
 @Configuration
public class OpenApiConfig {

@Bean
public OpenAPI customOpenAPI(){
    return new OpenAPI()
        .info(new Info()
            .title("PROCESAMIENTO DE LENGUAJE NATURAL")
            .version("1.0")
            .description("VERSION 1")
            .contact(new Contact().name("STE").url("https://www.ste.cdmx.gob.mx/")));
}
         
}
