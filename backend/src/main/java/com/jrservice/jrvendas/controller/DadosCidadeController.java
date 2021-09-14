package com.jrservice.jrvendas.controller;

import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.dto.SuccessDTO;
import com.jrservice.jrvendas.dto.SumDTO;
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
@RequestMapping(value = "/dados")
public class DadosCidadeController {

    @Autowired
    private DadosCidadeService service;

    @GetMapping
    public ResponseEntity<Page<DadosCidadeDTO>> findAll(Pageable pageable) {
        Page<DadosCidadeDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/soma-vendedores")
    public ResponseEntity<List<SumDTO>> amountGroupedBySeller() {
        List<SumDTO> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sucess-vendedores")
    public ResponseEntity<List<SuccessDTO>> sucessGroupedBySeller() {
        List<SuccessDTO> list = service.sucessGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
