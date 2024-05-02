package com.andervilo.portifolio.services.projeto.usecases;

import com.andervilo.portifolio.model.repositories.ProjetoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class ExcluirProjetoTest {
    @Mock
    ProjetoRepository projetoRepository;
    @InjectMocks
    ExcluirProjeto excluirProjeto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testExcluir() {
        excluirProjeto.excluir(1L);
        verify(projetoRepository).deleteById(any(Long.class));
    }
}