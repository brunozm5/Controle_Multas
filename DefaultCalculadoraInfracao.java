package Controle_Multas;

import java.math.BigDecimal;

public class DefaultCalculadoraInfracao implements CalculadoraInfracao {

    @Override
    public int calcularPontos(Infracao infracao) {
        return infracao.getTipo().getPontos();
    }

    @Override
    public BigDecimal calcularValor(Infracao infracao) {
        return infracao.getTipo().getValor();
    }
}
