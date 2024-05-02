package com.andervilo.portifolio.services.pessoa.usecases;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import com.andervilo.portifolio.services.mappers.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarFuncionarios {

    private final PessoaRepository pessoaRepository;
    public List<Pessoa> buscar(){

        return pessoaRepository.buscarFuncionarios();
    }
}
