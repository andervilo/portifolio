package com.andervilo.portifolio.types;

public enum RiscoType implements TypeDisplayValue {
    BAIXO("Baixo"), MEDIO("Médio"), ALTO("Alto");

    private final String displayValue;

    RiscoType(String displayValue){
        this.displayValue = displayValue;
    }

    @Override
    public String displayValue() {
        return displayValue;
    }
}
