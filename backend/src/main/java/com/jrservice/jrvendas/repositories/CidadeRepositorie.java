package com.jrservice.jrvendas.repositories;

import com.jrservice.jrvendas.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepositorie extends JpaRepository <Cidade, Long> {



}
