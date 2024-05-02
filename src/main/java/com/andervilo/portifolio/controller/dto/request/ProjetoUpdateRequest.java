package com.andervilo.portifolio.controller.dto.request;

import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.types.RiscoType;
import com.andervilo.portifolio.types.StatusType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjetoUpdateRequest {

    private Long id;

    private String nome;

    private LocalDate dataInicio;

    private LocalDate dataPrevisaoFim;

    private LocalDate dataFim;

    private String descricao;

    private StatusType status;

    private Float orcamento;

    private RiscoType risco;

    private Pessoa gerente;
}
