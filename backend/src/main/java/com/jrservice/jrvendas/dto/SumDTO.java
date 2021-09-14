package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.Cidade;

import java.io.Serializable;

public class SumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nomeCidade;
    private Double sum;

    public SumDTO(){

    }
    public SumDTO(Cidade cidade, Double sum) {
        this.nomeCidade = cidade.getName();
        this.sum = sum;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
