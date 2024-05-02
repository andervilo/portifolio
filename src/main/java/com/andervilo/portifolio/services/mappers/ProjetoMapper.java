package com.andervilo.portifolio.services.mappers;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.model.entities.Projeto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjetoMapper {
    ProjetoMapper INSTANCE = Mappers.getMapper( ProjetoMapper.class );

    ProjetoResponse toResponse(Projeto projeto);

    List<ProjetoResponse> toResponseList(List<Projeto> projetoList);

    Projeto toEntity(ProjetoCreateRequest createRequest);

    Projeto toEntity(ProjetoUpdateRequest updateRequest);
}
