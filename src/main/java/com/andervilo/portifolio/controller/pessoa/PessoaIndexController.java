package com.andervilo.portifolio.controller.pessoa;

import com.andervilo.portifolio.services.pessoa.PessoaService;
import com.andervilo.portifolio.services.projeto.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PessoaIndexController {

    private final PessoaService pessoaService;
    @GetMapping("/pessoas")
    public String novo(ModelMap model) {
        model.put("pessoas", pessoaService.buscarPessoas());
        return "pessoa/index";
    }

}
