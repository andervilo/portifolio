package com.andervilo.portifolio.services.pessoa;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;

import java.util.List;

public interface PessoaService {
    List<GerenteCombo> buscarGerentes();
    List<Pessoa> buscarPessoas();
    List<Pessoa> buscarFuncionarios();

    Pessoa adcionarPessoa(Pessoa pessoa);
}
