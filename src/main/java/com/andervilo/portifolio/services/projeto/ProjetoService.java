package com.andervilo.portifolio.services.projeto;

import com.andervilo.portifolio.controller.ProjetoFiltroDTO;
import com.andervilo.portifolio.model.entities.Projeto;

import java.util.List;

public interface ProjetoService {

    void atualizarProjeto(Projeto projeto);

    Projeto buscarProjeto(Long id) ;

    void criarProjeto(Projeto projeto) ;

    void excluirProjeto(Long id);

    List<Projeto> listarProjetos(ProjetoFiltroDTO projetoFiltro);


}
