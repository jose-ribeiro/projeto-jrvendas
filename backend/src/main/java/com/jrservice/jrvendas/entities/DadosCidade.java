package com.jrservice.jrvendas.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dadoscidade")
public class DadosCidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer atendimentos;
    private Double valor;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    public DadosCidade(){

    }


    public DadosCidade(Long id, Integer atendimentos, Double valor, LocalDate date, Cidade cidade) {
        this.id = id;
        this.atendimentos = atendimentos;
        this.valor = valor;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}


