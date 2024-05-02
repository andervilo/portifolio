package com.andervilo.portifolio.services.projeto;

import com.andervilo.portifolio.controller.ProjetoFiltroDTO;
import com.andervilo.portifolio.controller.dto.request.AdicionarMembroRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.entities.Projeto;

import java.util.List;

public interface ProjetoService {

    void atualizarProjeto(ProjetoUpdateRequest updateRequest);

    ProjetoResponse buscarProjeto(Long id) ;

    void criarProjeto(ProjetoCreateRequest createRequest) ;

    void excluirProjeto(Long id);

    List<ProjetoResponse> listarProjetos();

    List<Pessoa> buscarMembros(Long id);

    void AdicionarMembro(AdicionarMembroRequest membroRequest);
}
