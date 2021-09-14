package com.jrservice.jrvendas.dto;

import com.jrservice.jrvendas.entities.Cidade;

import java.io.Serializable;

public class CidadeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public  CidadeDTO(){

    }

    public CidadeDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public CidadeDTO(Cidade entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
