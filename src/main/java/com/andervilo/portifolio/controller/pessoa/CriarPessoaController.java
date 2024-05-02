package com.andervilo.portifolio.controller.pessoa;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.services.pessoa.PessoaService;
import com.andervilo.portifolio.services.projeto.ProjetoService;
import com.andervilo.portifolio.types.RiscoType;
import com.andervilo.portifolio.types.StatusType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class CriarPessoaController {

    private final ProjetoService projetoService;

    private final PessoaService pessoaService;
    @GetMapping("/nova-pessoa")
    public String novo(ModelMap model) {
        return "pessoa/create";
    }

    @PostMapping("/nova-pessoa")
    public String novo(ModelMap model, ProjetoCreateRequest createRequest, BindingResult result, RedirectAttributes redirectAttributes) {
//        projetoService.criarProjeto(createRequest);
//        redirectAttributes.addAttribute("message", "CREATE_SUCCESS");
        return "redirect:/pessoas";
    }
}
