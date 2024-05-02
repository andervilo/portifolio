package com.andervilo.portifolio.controller.projeto;

import com.andervilo.portifolio.services.projeto.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final ProjetoService projetoService;
    @GetMapping("/")
    public String home(ModelMap model, @ModelAttribute("message") String message) {
        model.put("projetos", projetoService.listarProjetos());
        model.put("message", message);
        return "projeto/index";
    }
}
