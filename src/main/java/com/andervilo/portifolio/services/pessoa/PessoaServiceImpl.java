package com.andervilo.portifolio.services.pessoa;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.services.pessoa.usecases.BuscarGerentes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService{

    private final BuscarGerentes buscarGerentes;

    @Override
    public List<GerenteCombo> buscarGerentes() {
        return buscarGerentes.buscar();
    }
}
