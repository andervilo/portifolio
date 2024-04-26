package com.andervilo.portifolio.model.repositories;

import com.andervilo.portifolio.model.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
