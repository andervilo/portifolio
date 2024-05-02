package com.andervilo.portifolio.services.projeto;

import com.andervilo.portifolio.controller.ProjetoFiltroDTO;
import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.services.projeto.usecases.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjetoServiceImpl implements ProjetoService {

    private final AtualizarProjeto atualizarProjeto;
    private final BuscarProjeto buscarProjeto;
    private final CriarProjeto criarProjeto;
    private final ExcluirProjeto excluirProjeto;
    private final ListarProjetos listarProjetos;
    @Override
    public void atualizarProjeto(ProjetoUpdateRequest updateRequest) {
        atualizarProjeto.atualizar(updateRequest);
    }

    @Override
    public ProjetoResponse buscarProjeto(Long id) {
        return buscarProjeto.buscar(id);
    }

    @Override
    public void criarProjeto(ProjetoCreateRequest createRequest) {
        criarProjeto.criar(createRequest);
    }

    @Override
    public void excluirProjeto(Long id) {
        excluirProjeto.excluir(id);
    }

    @Override
    public List<ProjetoResponse> listarProjetos() {
        return listarProjetos.listar();
    }
}
