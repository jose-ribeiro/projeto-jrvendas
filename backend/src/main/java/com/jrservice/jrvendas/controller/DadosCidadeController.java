package com.jrservice.jrvendas.controller;

import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.dto.DadosCidadeSuccessDTO;
import com.jrservice.jrvendas.dto.DadosCidadeSum;
import com.jrservice.jrvendas.service.DadosCidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dadoscidade")
public class DadosCidadeController {
    @Autowired
    private DadosCidadeService service;

    @GetMapping
    public ResponseEntity<Page<DadosCidadeDTO>> findAll(Pageable pageable) {
        Page<DadosCidadeDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/vendas-por-cidade")
    public ResponseEntity<List<DadosCidadeSum>> amountGroupedBySeller() {
        List<DadosCidadeSum> list = service.amountGroupedBy();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<DadosCidadeSuccessDTO>> successGroupedBySeller() {
        List<DadosCidadeSuccessDTO> list = service.successGroupedBy();
        return ResponseEntity.ok(list);
    }
}

