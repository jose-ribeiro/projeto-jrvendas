package com.jrservice.jrvendas.controller;

import com.jrservice.jrvendas.dto.CidadeDTO;
import com.jrservice.jrvendas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cidades")
public class CidadeController {

    @Autowired
    private CidadeService service;

    @GetMapping
    public ResponseEntity<List<CidadeDTO>> findAll(){
        List<CidadeDTO> List = service.findAll();
        return ResponseEntity.ok(List);
    }
}
