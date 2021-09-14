package com.jrservice.jrvendas.service;


import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.entities.DadosCidade;
import com.jrservice.jrvendas.repositories.CidadeRepository;
import com.jrservice.jrvendas.repositories.DadosCidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DadosCidadeService {

    @Autowired
    private DadosCidadeRepository repository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Transactional(readOnly = true)
    public Page<DadosCidadeDTO> findAll(Pageable pageable){
        cidadeRepository.findAll();
        Page<DadosCidade> result = repository.findAll(pageable);
        return result.map(x -> new DadosCidadeDTO(x));
    }

}
