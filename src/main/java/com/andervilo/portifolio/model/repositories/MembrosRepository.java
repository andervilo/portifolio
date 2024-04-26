package com.andervilo.portifolio.model.repositories;

import com.andervilo.portifolio.model.entities.Membros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembrosRepository extends JpaRepository<Membros, Long> {
}
