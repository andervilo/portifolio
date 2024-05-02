package com.andervilo.portifolio.rest;

import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.services.pessoa.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;
    @PostMapping
    public Pessoa adicionarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.adcionarPessoa(pessoa);
    }

}
