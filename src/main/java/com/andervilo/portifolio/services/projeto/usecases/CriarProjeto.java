package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import com.andervilo.portifolio.services.mappers.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CriarProjeto {

    private final ProjetoRepository projetoRepository;
    private final ProjetoMapper projetoMapper;
    public Projeto criar(ProjetoCreateRequest createRequest){
        Projeto projeto = projetoMapper.toEntity(createRequest);
        return projetoRepository.save(projeto);
    }
}
