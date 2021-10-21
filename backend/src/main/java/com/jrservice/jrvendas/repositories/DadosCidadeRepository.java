package com.jrservice.jrvendas.repositories;

import com.jrservice.jrvendas.dto.SuccessDTO;
import com.jrservice.jrvendas.dto.SumDTO;
import com.jrservice.jrvendas.entities.DadosCidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DadosCidadeRepository extends JpaRepository <DadosCidade, Long> {

    @Query("SELECT new com.jrservice.jrvendas.dto.SumDTO(obj.cidade, SUM(obj.valor)) "
            + " FROM DadosCidade AS obj GROUP BY obj.cidade ORDER BY obj.cidade ASC")
    List<SumDTO> amountGroupedBySeller();

    @Query("SELECT new com.jrservice.jrvendas.dto.SuccessDTO(obj.cidade, SUM(obj.atendimentos)) "
            + " FROM DadosCidade AS obj GROUP BY obj.cidade ORDER BY obj.cidade ASC")
    List<SuccessDTO> sucessGroupedBySeller();

}
