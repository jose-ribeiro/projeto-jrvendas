package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.Cidade;

import java.io.Serializable;

public class DadosCidadeSum implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cidadeName;
    private Double sum;

    public DadosCidadeSum(){

    }

    public DadosCidadeSum(Cidade cidade, Double sum) {
        this.cidadeName = cidade.getName();
        this.sum = sum;
    }

    public String getCidadeName() {
        return cidadeName;
    }

    public void setCidadeName(String cidadeName) {
        this.cidadeName = cidadeName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
