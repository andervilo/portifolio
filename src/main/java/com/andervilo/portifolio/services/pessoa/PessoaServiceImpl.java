package com.andervilo.portifolio.services.pessoa;

import com.andervilo.portifolio.controller.dto.response.GerenteCombo;
import com.andervilo.portifolio.model.entities.Pessoa;
import com.andervilo.portifolio.services.pessoa.usecases.AdicionarPessoa;
import com.andervilo.portifolio.services.pessoa.usecases.BuscarFuncionarios;
import com.andervilo.portifolio.services.pessoa.usecases.BuscarGerentes;
import com.andervilo.portifolio.services.pessoa.usecases.BuscarPessoas;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private final BuscarGerentes buscarGerentes;
    private final BuscarPessoas buscarPessoas;
    private final BuscarFuncionarios buscarFuncionarios;
    private final AdicionarPessoa adicionarPessoa;

    @Override
    public List<GerenteCombo> buscarGerentes() {
        return buscarGerentes.buscar();
    }

    @Override
    public List<Pessoa> buscarPessoas() {
        return buscarPessoas.buscar();
    }

    @Override
    public List<Pessoa> buscarFuncionarios() {
        return buscarFuncionarios.buscar();
    }

    @Override
    public Pessoa adcionarPessoa(Pessoa pessoa) {
        return adicionarPessoa.adicionar(pessoa);
    }
}
