package com.andervilo.portifolio.services.pessoa;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;

import java.util.List;

public interface PessoaService {
    List<GerenteCombo> buscarGerentes();
}
