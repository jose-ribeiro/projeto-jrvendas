package com.jrservice.jrvendas.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


public class DadosCidade {

    private Long id;
    private Integer atendimentos;
    private Double valor;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    public DadosCidade(){

    }


    public DadosCidade(Long id, Integer atendimentos, Double valor, LocalDate data, Cidade cidade) {
        this.id = id;
        this.atendimentos = atendimentos;
        this.valor = valor;
        this.data = data;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Integer atendimentos) {
        this.atendimentos = atendimentos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}


