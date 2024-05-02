package com.andervilo.portifolio.controller.projeto;

import com.andervilo.portifolio.controller.dto.request.ProjetoCreateRequest;
import com.andervilo.portifolio.controller.dto.request.ProjetoUpdateRequest;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class AtualizarController {

    private final ProjetoService projetoService;

    private final PessoaService pessoaService;
    @GetMapping("/atualizar-projeto/{id}")
    public String novo(ModelMap model, @PathVariable Long id) {
        model.put("projeto", new ProjetoUpdateRequest());
        model.put("projetoExistente", projetoService.buscarProjeto(id));
        model.put("statusList", StatusType.values());
        model.put("riscoList", RiscoType.values());
        model.put("gerentes", pessoaService.buscarGerentes());
        return "projeto/update";
    }

    @PostMapping("/atualizar-projeto/{id}")
    public String novo(ModelMap model, ProjetoUpdateRequest updateRequest , BindingResult result, @PathVariable Long id, RedirectAttributes redirectAttributes) {
        projetoService.atualizarProjeto(updateRequest);
        redirectAttributes.addAttribute("message", "UPDATE_SUCCESS");
        return "redirect:/";
    }
}
