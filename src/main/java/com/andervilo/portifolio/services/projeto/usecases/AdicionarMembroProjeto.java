package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.request.AdicionarMembroRequest;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.model.repositories.PessoaRepository;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdicionarMembroProjeto {

    private final PessoaRepository pessoaRepository;
    private final ProjetoRepository projetoRepository;
    public void criar(AdicionarMembroRequest membroRequest){
        Pessoa pessoa = pessoaRepository.getReferenceById(membroRequest.getIdPessoa());
        Projeto projeto = projetoRepository.getReferenceById(membroRequest.getIdProjeto());
        projeto.getMembros().add(pessoa);
        projetoRepository.save(projeto);
    }
}
