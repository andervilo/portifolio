package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Projeto;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import com.andervilo.portifolio.services.mappers.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarProjeto {

    private final ProjetoRepository projetoRepository;
    private final ProjetoMapper projetoMapper;

    public ProjetoResponse buscar(Long id){
        Projeto projeto = projetoRepository.findById(id).orElseThrow(()-> new RuntimeException("Projeto não encontrado!"));
        return projetoMapper.toResponse(projeto);
    }
}
