package com.willianoliveira.atendimento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(produces = "text/plain")
    public String HelloWorld(){
        return "Hello World";
    }
}