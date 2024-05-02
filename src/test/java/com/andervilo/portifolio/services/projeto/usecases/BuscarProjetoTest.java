package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import com.andervilo.portifolio.services.mappers.ProjetoMapper;
import com.andervilo.portifolio.types.RiscoType;
import com.andervilo.portifolio.types.StatusType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import static org.mockito.Mockito.*;

class BuscarProjetoTest {
    @Mock
    ProjetoRepository projetoRepository;
    @Mock
    ProjetoMapper projetoMapper;
    @InjectMocks
    BuscarProjeto buscarProjeto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBuscar() {
        Projeto projeto = new Projeto(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, Float.valueOf(1.1f), RiscoType.BAIXO, new Pessoa(Long.valueOf(1), "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true));
        when(projetoRepository.findById(any(Long.class))).thenReturn(Optional.of(projeto));
        ProjetoResponse projetoResponse = new ProjetoResponse(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, Float.valueOf(1.1f), RiscoType.BAIXO, new Pessoa(Long.valueOf(1), "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true));
        when(projetoMapper.toResponse(any(Projeto.class))).thenReturn(projetoResponse);

        ProjetoResponse result = buscarProjeto.buscar(1L);
        Assertions.assertEquals(projetoResponse, result);
    }
}
