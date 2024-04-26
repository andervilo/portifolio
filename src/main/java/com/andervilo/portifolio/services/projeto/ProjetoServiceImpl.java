package com.andervilo.portifolio.services.projeto;

import com.andervilo.portifolio.controller.ProjetoFiltroDTO;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.services.projeto.usecases.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProjetoServiceImpl implements ProjetoService {

    private final AtualizarProjeto atualizarProjeto;
    private final BuscarProjeto buscarProjeto;
    private final CriarProjeto criarProjeto;
    private final ExcluirProjeto excluirProjeto;
    private final ListarProjetos listarProjetos;
    @Override
    public void atualizarProjeto(Projeto projeto) {
        atualizarProjeto.atualizar(projeto);
    }

    @Override
    public Projeto buscarProjeto(Long id) {
        return buscarProjeto.buscar(id);
    }

    @Override
    public void criarProjeto(Projeto projeto) {
        criarProjeto.criar(projeto);
    }

    @Override
    public void excluirProjeto(Long id) {
        excluirProjeto.excluir(id);
    }

    @Override
    public List<Projeto> listarProjetos(ProjetoFiltroDTO projetoFiltro) {
        return listarProjetos.listar(projetoFiltro);
    }
}
