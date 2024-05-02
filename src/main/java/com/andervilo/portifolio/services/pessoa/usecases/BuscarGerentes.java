package com.andervilo.portifolio.services.pessoa.usecases;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import com.andervilo.portifolio.services.mappers.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class BuscarGerentes {

    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;
    public List<GerenteCombo> buscar(){

        return pessoaMapper.toResponseList(pessoaRepository.buscarGerentes());
    }
}
