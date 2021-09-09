package com.jrservice.jrvendas.service;

import com.jrservice.jrvendas.dto.CidadeDTO;
import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.entities.Cidade;
import com.jrservice.jrvendas.entities.DadosCidade;
import com.jrservice.jrvendas.repositories.CidadeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
;import java.util.List;
import java.util.stream.Collectors;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepositorie repository;

    public List<CidadeDTO> findAll(){
        List<Cidade> result = repository.findAll();
        return result.stream().map(x -> new CidadeDTO(x)).collect(Collectors.toList());
    }
}






