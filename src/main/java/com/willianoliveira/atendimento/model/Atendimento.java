package com.willianoliveira.atendimento.model;

import lombok.Data;

@Data
public class Atendimento {
    private String sumario;
    private LocalDateTime criacao;
    private String descricao;
    private TipoAtendimento tipo;
    private Cliente cliente;
    private Operador responsavel;
}