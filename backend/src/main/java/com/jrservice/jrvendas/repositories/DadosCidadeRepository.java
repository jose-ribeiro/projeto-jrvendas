package com.jrservice.jrvendas.repositories;

import com.jrservice.jrvendas.entities.DadosCidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosCidadeRepository extends JpaRepository <DadosCidade, Long> {
}
