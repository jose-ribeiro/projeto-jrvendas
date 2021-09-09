package com.jrservice.jrvendas.repositories;

import com.jrservice.jrvendas.entities.DadosCidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosCidadeRepositorie extends JpaRepository <DadosCidade, Long> {
}
