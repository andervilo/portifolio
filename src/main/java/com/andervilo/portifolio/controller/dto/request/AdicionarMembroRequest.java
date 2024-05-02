package com.andervilo.portifolio.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdicionarMembroRequest {
    private Long idProjeto;
    private Long idPessoa;
}
