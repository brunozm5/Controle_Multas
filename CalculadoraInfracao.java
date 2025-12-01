package Controle_Multas;

import java.math.BigDecimal;

public interface CalculadoraInfracao {
    int calcularPontos(Infracao infracao);
    BigDecimal calcularValor(Infracao infracao);
}
