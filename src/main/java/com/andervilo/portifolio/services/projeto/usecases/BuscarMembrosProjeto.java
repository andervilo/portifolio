package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarMembrosProjeto {

    private final PessoaRepository pessoaRepository;

    public List<Pessoa> buscar(Long id){
        return pessoaRepository.buscarMembrosPorProjetoId(id);
    }
}
