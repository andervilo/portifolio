package com.andervilo.portifolio.controller.projeto;

import com.andervilo.portifolio.services.projeto.ProjetoService;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Hidden
@RestController
@RequiredArgsConstructor
public class ExcluirController {

    private final ProjetoService projetoService;
    @DeleteMapping ("/excluir-projeto/{id}")
    public ResponseEntity<String> novo(@PathVariable Long id) {
        projetoService.excluirProjeto(id);
        return ResponseEntity.ok().body("ok");
    }
}
