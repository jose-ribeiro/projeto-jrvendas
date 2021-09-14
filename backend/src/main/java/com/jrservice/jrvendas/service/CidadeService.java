package com.jrservice.jrvendas.service;

import com.jrservice.jrvendas.dto.CidadeDTO;
import com.jrservice.jrvendas.entities.Cidade;
import com.jrservice.jrvendas.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository repository;

    public List<CidadeDTO> findAll(){
        List<Cidade> result = repository.findAll();
        return result.stream().map(x -> new CidadeDTO(x)).collect(Collectors.toList());
    }
}
