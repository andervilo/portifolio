package com.andervilo.portifolio.services.pessoa.usecases;

import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AdicionarPessoa {

    private final PessoaRepository pessoaRepository;
    public Pessoa adicionar(Pessoa pessoa){

        return pessoaRepository.save(pessoa);
    }
}
