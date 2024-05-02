package com.andervilo.portifolio.controller.projeto;

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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class CriarController {

    private final ProjetoService projetoService;

    private final PessoaService pessoaService;
    @GetMapping("/novo-projeto")
    public String novo(ModelMap model) {
        model.put("projeto", new ProjetoCreateRequest());
        model.put("statusList", StatusType.values());
        model.put("riscoList", RiscoType.values());
        model.put("gerentes", pessoaService.buscarGerentes());
        return "projeto/create";
    }

    @PostMapping("/novo-projeto")
    public String novo(ModelMap model, ProjetoCreateRequest createRequest, BindingResult result, RedirectAttributes redirectAttributes) {
        projetoService.criarProjeto(createRequest);
        redirectAttributes.addAttribute("message", "CREATE_SUCCESS");
        return "redirect:/";
    }
}
