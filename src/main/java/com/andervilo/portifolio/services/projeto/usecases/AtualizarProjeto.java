package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import com.andervilo.portifolio.services.mappers.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AtualizarProjeto {

    private final ProjetoRepository projetoRepository;
    private final ProjetoMapper projetoMapper;
    public ProjetoResponse atualizar(ProjetoUpdateRequest updateRequest){
        return projetoMapper.toResponse(projetoRepository.save(projetoMapper.toEntity(updateRequest)));
    }
}
