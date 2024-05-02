package com.andervilo.portifolio.controller.projeto;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.response.ProjetoResponse;
import com.andervilo.portifolio.services.pessoa.PessoaService;
import com.andervilo.portifolio.services.projeto.ProjetoService;
import com.andervilo.portifolio.types.RiscoType;
import com.andervilo.portifolio.types.StatusType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class VisualizarController {

    private final ProjetoService projetoService;
    @GetMapping("/visualizar-projeto/{id}")
    public String novo(ModelMap model, @PathVariable Long id) {
        ProjetoResponse response = projetoService.buscarProjeto(id);
        model.put("projeto", response);
        return "projeto/view";
    }
}
