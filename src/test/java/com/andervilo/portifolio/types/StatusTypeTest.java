package com.andervilo.portifolio.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatusTypeTest {
    @Test
    void testDisplayValue_EmAnalise() {
        String result = StatusType.EM_ANALISE.displayValue();
        Assertions.assertEquals("Em Análise", result);
    }

    @Test
    void testDisplayValue_AnaliseAprovada() {
        String result = StatusType.ANALISE_APROVADA.displayValue();
        Assertions.assertEquals("Análise Aprovada", result);
    }
    @Test
    void testDisplayValue_AnaliseRealizada() {
        String result = StatusType.ANALISE_REALIZADA.displayValue();
        Assertions.assertEquals("Análise Realizada", result);
    }

    @Test
    void testDisplayValue_Cancelado() {
        String result = StatusType.CANCELADO.displayValue();
        Assertions.assertEquals("Cancelado", result);
    }

    @Test
    void testDisplayValue_EmAndamento() {
        String result = StatusType.EM_ANDAMENTO.displayValue();
        Assertions.assertEquals("Em Andamento", result);
    }

    @Test
    void testDisplayValue_Encerrado() {
        String result = StatusType.ENCERRADO.displayValue();
        Assertions.assertEquals("Encerrado", result);
    }

    @Test
    void testDisplayValue_Iniciado() {
        String result = StatusType.INICIADO.displayValue();
        Assertions.assertEquals("Iniciado", result);
    }

}
