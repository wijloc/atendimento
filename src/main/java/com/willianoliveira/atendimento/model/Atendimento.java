package com.willianoliveira.atendimento.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Um atendiento é uma iteração criada pelo cliente e atendidada operador
 */
@Data
@NoArgsConstructor
@Entity
public class Atendimento {

    /**
     * Identificador do objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Descrição breve para que o operador possa iniciar o atendimento
     * @see #descricao
     */
    private String sumario;
    /**
     * Data e hora da criação
     */
    private LocalDateTime criacao;
    /**
     * Descrição detalhada
     */
    private String descricao;
    /**
     * Tipo de atendimento de acordo com as opções disponíveis em {@link com.willianoliveira.atendimento.model.TipoAtendimento Tipo de Atendimento}.
     * @see #sumario
     */
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipo;
    /**
     * {@link com.willianoliveira.atendimento.model.Cliente Cliente} que requisitou o atendimento.
     */
    @ManyToOne
    private Cliente cliente;
    /**
     * {@link com.willianoliveira.atendimento.model.Operador Operador} responsável pela próxima iteração do atendimento.
     */
    @ManyToOne
    private Operador responsavel;
}