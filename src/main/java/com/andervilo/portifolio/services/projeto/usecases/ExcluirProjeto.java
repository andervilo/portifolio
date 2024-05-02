package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExcluirProjeto {

    private final ProjetoRepository projetoRepository;
    public void excluir(Long id){
        projetoRepository.deleteById(id);
    }
}
