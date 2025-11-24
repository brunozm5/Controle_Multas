package Controle_Multas;

import java.math.BigDecimal;

public enum TipoInfra {
    LEVE(3, new BigDecimal("88.30")),
    MEDIA(4, new BigDecimal("130.16")),
    GRAVE(5, new BigDecimal("195.23")),
    GRAVISSIMA(7, new BigDecimal("293.47"));

    private final int pontos;
    private final BigDecimal valor;

    TipoInfra(int pontos, BigDecimal valor) {
        this.pontos = pontos;
        this.valor = valor;
    }

    public int getPontos() {
        return pontos;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
