package com.andervilo.portifolio.model.repositories;

import com.andervilo.portifolio.model.entities.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
