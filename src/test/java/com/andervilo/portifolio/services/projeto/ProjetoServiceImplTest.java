package com.andervilo.portifolio.services.projeto;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.services.projeto.usecases.*;
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

class ProjetoServiceImplTest {
    @Mock
    AtualizarProjeto atualizarProjeto;
    @Mock
    BuscarProjeto buscarProjeto;
    @Mock
    CriarProjeto criarProjeto;
    @Mock
    ExcluirProjeto excluirProjeto;
    @Mock
    ListarProjetos listarProjetos;
    @InjectMocks
    ProjetoServiceImpl projetoServiceImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAtualizarProjeto() {
        when(atualizarProjeto.atualizar(any(ProjetoUpdateRequest.class))).thenReturn(new ProjetoResponse(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true)));

        projetoServiceImpl.atualizarProjeto(new ProjetoUpdateRequest(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true)));
    }

    @Test
    void testBuscarProjeto() {
        ProjetoResponse projetoResponse = new ProjetoResponse(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true));
        when(buscarProjeto.buscar(anyLong())).thenReturn(projetoResponse);

        ProjetoResponse result = projetoServiceImpl.buscarProjeto(1L);
        Assertions.assertEquals(projetoResponse, result);
    }

    @Test
    void testCriarProjeto() {
        when(criarProjeto.criar(any(ProjetoCreateRequest.class))).thenReturn(new Projeto(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true), List.of()
                ));

        projetoServiceImpl.criarProjeto(new ProjetoCreateRequest("nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true)));
    }

    @Test
    void testExcluirProjeto() {
        projetoServiceImpl.excluirProjeto(1L);
        verify(excluirProjeto).excluir(anyLong());
    }

    @Test
    void testListarProjetos() {
        ProjetoResponse response = new ProjetoResponse(1L, "nome", LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), LocalDate.of(2024, Month.MAY, 1), "descricao", StatusType.EM_ANALISE, 1.1f, RiscoType.BAIXO, new Pessoa(1L, "nome", LocalDate.of(2024, Month.MAY, 1), "cpf", true, true));
        when(listarProjetos.listar()).thenReturn(List.of(response));

        List<ProjetoResponse> result = projetoServiceImpl.listarProjetos();
        Assertions.assertEquals(List.of(response), result);
    }
}
