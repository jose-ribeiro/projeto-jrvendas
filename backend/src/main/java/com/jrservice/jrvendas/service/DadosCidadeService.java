package com.jrservice.jrvendas.service;

import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.entities.Cidade;
import com.jrservice.jrvendas.entities.DadosCidade;
import com.jrservice.jrvendas.repositories.DadosCidadeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DadosCidadeService {

    @Autowired
    private DadosCidadeRepositorie dadosCidadeRepository;

    public List<DadosCidadeDTO> findAll(){
        List<DadosCidade> result = dadosCidadeRepository.findAll();
        return result.stream().map(x -> new DadosCidadeDTO(x)).collect(Collectors.toList());
    }
}
