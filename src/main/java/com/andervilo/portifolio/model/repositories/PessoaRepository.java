package com.andervilo.portifolio.model.repositories;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p WHERE p.gerente = true ")
    List<Pessoa> buscarGerentes();
}
