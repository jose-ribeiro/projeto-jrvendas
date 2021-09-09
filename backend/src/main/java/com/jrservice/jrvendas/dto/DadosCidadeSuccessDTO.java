package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.Cidade;

import java.io.Serializable;

public class DadosCidadeSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cidadeNome;
    private Long atendimentos;

    public DadosCidadeSuccessDTO(){

    }

    public DadosCidadeSuccessDTO(Cidade cidade, Long atendimentos) {
        cidadeNome = cidade.getName();
        this.atendimentos = atendimentos;
    }

    public String getCidadeNome() {
        return cidadeNome;
    }

    public void setCidadeNome(String cidadeNome) {
        this.cidadeNome = cidadeNome;
    }

    public Long getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Long atendimentos) {
        this.atendimentos = atendimentos;
    }
}
