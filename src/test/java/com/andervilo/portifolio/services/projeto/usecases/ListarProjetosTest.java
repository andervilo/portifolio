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
import java.util.List;

import static org.mockito.Mockito.*;

class ListarProjetosTest {
    @Mock
    ProjetoRepository projetoRepository;
    @Mock
    ProjetoMapper projetoMapper;
    @InjectMocks
    ListarProjetos listarProjetos;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListar() {
        when(projetoRepository.findAll()).thenReturn(List.of(new Projeto()));
        ProjetoResponse response = new ProjetoResponse(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, Float.valueOf(1.1f), RiscoType.BAIXO, new Pessoa(Long.valueOf(1), "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true));
        when(projetoMapper.toResponseList(any(List.class))).thenReturn(List.of(response));

        List<ProjetoResponse> result = listarProjetos.listar();
        Assertions.assertEquals(response.getId(), result.get(0).getId());
        Assertions.assertEquals(response.getNome(), result.get(0).getNome());
        Assertions.assertEquals(response.getDescricao(), result.get(0).getDescricao());
        Assertions.assertEquals(response.getDataInicio(), result.get(0).getDataInicio());
        Assertions.assertEquals(response.getDataFim(), result.get(0).getDataFim());
        Assertions.assertEquals(response.getDataPrevisaoFim(), result.get(0).getDataPrevisaoFim());
        Assertions.assertEquals(response.getOrcamento(), result.get(0).getOrcamento());
        Assertions.assertEquals(response.getRisco(), result.get(0).getRisco());
        Assertions.assertEquals(response.getStatus(), result.get(0).getStatus());
        Assertions.assertEquals(response.getGerente(), result.get(0).getGerente());
    }
}
