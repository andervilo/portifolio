package com.andervilo.portifolio.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RiscoTypeTest {

    @Test
    void testDisplayValue_RiscoBaixo() {
        String result = RiscoType.BAIXO.displayValue();
        Assertions.assertEquals("Baixo", result);
    }
    @Test
    void testDisplayValue_RiscoMedio() {
        String result = RiscoType.MEDIO.displayValue();
        Assertions.assertEquals("Médio", result);
    }
    @Test
    void testDisplayValue_RiscoAlto() {
        String result = RiscoType.ALTO.displayValue();
        Assertions.assertEquals("Alto", result);
    }
}