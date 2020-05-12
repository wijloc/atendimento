package com.willianoliveira.atendimento.controllers;

import java.util.List;

import com.willianoliveira.atendimento.model.Cliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("clientes")
    public List<Cliente> consultaCliente(@RequestParam String sort){
        return List.of(
            new Cliente(1L, "Willian", "willian@dominio.com.br"),
            new Cliente(2L, sort, "jorge@dominio.com.br")
        );
    }
    @GetMapping("clientes/{id}")
    public Cliente getById(@PathVariable Long id){
        return new Cliente(id, "Willian", "willian@dominio.com.br");
    }

    @PostMapping("clientes")
    public Cliente incluirClientes(@RequestBody Cliente body){
        body.setId(5L);
        return body;
    }

    @PutMapping("clientes/{id}")
    public Cliente incluirClientes(@RequestBody Cliente body, @PathVariable Long id){
        body.setId(id);
        return body;
    }

    @DeleteMapping("clientes/{id}")
    public void removeCliente(@PathVariable Long id){
        System.out.println(id);
    }
}