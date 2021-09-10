package com.jrservice.jrvendas.repositories;

import com.jrservice.jrvendas.dto.DadosCidadeSuccessDTO;
import com.jrservice.jrvendas.dto.DadosCidadeSum;
import com.jrservice.jrvendas.entities.DadosCidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DadosCidadeRepositorie extends JpaRepository <DadosCidade, Long> {

    @Query("SELECT new com.jrservice.jrvendas.dto.DadosCidadeSum(obj.cidade, SUM(obj.valor)) "
            + " FROM DadosCidade AS obj GROUP BY obj.cidade")
    List<DadosCidadeSum> amountGroupedBy();

    @Query("SELECT new om.jrservice.jrvendas.dto.DadosCidadeSuccessDTO(obj.cidade, SUM(obj.atendimentos)) "
            + " FROM DadosCidade AS obj GROUP BY obj.seller")
    List<DadosCidadeSuccessDTO> successGroupedBy();
}
