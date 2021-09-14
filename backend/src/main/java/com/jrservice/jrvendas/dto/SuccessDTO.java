package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.Cidade;

public class SuccessDTO {

    private String nomeCidade;
    private Long atendimentos;

    public SuccessDTO(){

    }

    public SuccessDTO(Cidade cidade, Long atendimentos) {
        nomeCidade = cidade.getName();
        this.atendimentos = atendimentos;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Long getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Long atendimentos) {
        this.atendimentos = atendimentos;
    }
}
