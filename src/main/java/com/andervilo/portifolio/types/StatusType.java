package com.andervilo.portifolio.types;

public enum StatusType implements TypeDisplayValue {
    EM_ANALISE("Em Análise"),
    ANALISE_REALIZADA("Análise Realizada"),
    ANALISE_APROVADA("Análise Aprovada"),
    INICIADO("Iniciado"),
    PLANEJADO("Planejado"),
    EM_ANDAMENTO("Em Andamento"),
    ENCERRADO("Encerrado"),
    CANCELADO("Cancelado");

    private final String displayValue;

    StatusType(String displayValue){
        this.displayValue = displayValue;
    }

    @Override
    public String displayValue() {
        return displayValue;
    }
}
