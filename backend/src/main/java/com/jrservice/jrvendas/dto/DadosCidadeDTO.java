package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.DadosCidade;

import java.time.LocalDate;

public class DadosCidadeDTO {

    private Long id;
    private Integer atendimentos;
    private Double valor;
    private LocalDate date;

    private CidadeDTO cidade;

    public DadosCidadeDTO (){

    }

    public DadosCidadeDTO(Long id, Integer atendimentos, Double valor, LocalDate date, CidadeDTO cidade) {
        this.id = id;
        this.atendimentos = atendimentos;
        this.valor = valor;
        this.date = date;
        this.cidade = cidade;
    }

    public DadosCidadeDTO(DadosCidade entity) {
        id = entity.getId();
        atendimentos = entity.getAtendimentos();
        valor = entity.getValor();
        date = entity.getDate();
        cidade = new CidadeDTO(entity.getCidade());
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }
}
