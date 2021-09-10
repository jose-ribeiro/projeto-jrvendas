package com.jrservice.jrvendas.service;

import com.jrservice.jrvendas.dto.DadosCidadeDTO;
import com.jrservice.jrvendas.dto.DadosCidadeSuccessDTO;
import com.jrservice.jrvendas.dto.DadosCidadeSum;
import com.jrservice.jrvendas.entities.DadosCidade;
import com.jrservice.jrvendas.repositories.CidadeRepositorie;
import com.jrservice.jrvendas.repositories.DadosCidadeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class DadosCidadeService {

    @Autowired
    private DadosCidadeRepositorie dadosCidadeRepository;

    @Autowired
    public CidadeRepositorie cidadeRepository;

    //busca paginada
    @Transactional(readOnly = true)
    public Page<DadosCidadeDTO> findAll(Pageable pageable){
        cidadeRepository.findAll();
        Page<DadosCidade> result = dadosCidadeRepository.findAll( pageable);
        return result.map(x -> new DadosCidadeDTO(x));
    }
    @Transactional(readOnly = true)
    public List<DadosCidadeSum> amountGroupedBy() {
        return dadosCidadeRepository.amountGroupedBy();
    }

    @Transactional(readOnly = true)
    public List<DadosCidadeSuccessDTO> successGroupedBy() {
        return dadosCidadeRepository.successGroupedBy();
    }
}
