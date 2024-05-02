package com.andervilo.portifolio.services.pessoa.usecases;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import com.andervilo.portifolio.services.mappers.PessoaMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.mockito.Mockito.*;

class BuscarGerentesTest {
    @Mock
    PessoaRepository pessoaRepository;
    @Mock
    PessoaMapper pessoaMapper;
    @InjectMocks
    BuscarGerentes buscarGerentes;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBuscar() {
        Pessoa pessoa = new Pessoa(Long.valueOf(1), "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true);
        when(pessoaRepository.buscarGerentes()).thenReturn(List.of(pessoa));
        when(pessoaMapper.toResponseList(any(List.class))).thenReturn(List.of(new GerenteCombo(Long.valueOf(1), "nome")));

        List<GerenteCombo> result = buscarGerentes.buscar();
        Assertions.assertEquals(pessoa.getNome(), result.get(0).getNome());
    }
}