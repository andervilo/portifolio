package com.andervilo.portifolio.services.mappers;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaMapper {
    PessoaMapper INSTANCE = Mappers.getMapper( PessoaMapper.class );

    GerenteCombo toResponse(Pessoa pessoa);

    List<GerenteCombo> toResponseList(List<Pessoa> pessoaList);
    @Mapping(source = "id", target = "id")
    Pessoa toEntity(GerenteCombo gerenteCombo);
}
