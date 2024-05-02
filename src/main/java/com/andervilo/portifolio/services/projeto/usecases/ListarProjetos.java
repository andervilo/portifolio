package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import com.andervilo.portifolio.services.mappers.ProjetoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class ListarProjetos {

    private final ProjetoRepository projetoRepository;
    private final ProjetoMapper projetoMapper;
    public List<ProjetoResponse> listar(){

        return projetoMapper.toResponseList(projetoRepository.findAll());
    }
}
