package com.andervilo.portifolio.controller.projeto;

import com.andervilo.portifolio.controller.dto.request.AdicionarMembroRequest;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class AdicionarMembroController {

    private final ProjetoService projetoService;

    private final PessoaService pessoaService;
    @GetMapping("/adicionar-membro/{id}")
    public String novo(ModelMap model, @PathVariable Long id) {
        ProjetoResponse projeto = projetoService.buscarProjeto(id);
        model.put("projeto", projeto);
        model.put("funcionarios", pessoaService.buscarFuncionarios());
        model.put("membro", new AdicionarMembroRequest());
        model.put("membros", projetoService.buscarMembros(id));
        return "projeto/add-member";
    }

    @PostMapping("/adicionar-membro/{id}")
    public String novo(ModelMap model, AdicionarMembroRequest membroRequest, BindingResult result, RedirectAttributes redirectAttributes) {
        projetoService.AdicionarMembro(membroRequest);
        return "redirect:/adicionar-membro/{id}";
    }
}
