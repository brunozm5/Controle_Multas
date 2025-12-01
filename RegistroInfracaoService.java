package Controle_Multas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistroInfracaoService {

    private final CalculadoraInfracao calculadora;
    private final AvaliadorSituacaoCnh avaliador;
    private final List<Infracao> historico = new ArrayList<>();

    public RegistroInfracaoService(CalculadoraInfracao calculadora, AvaliadorSituacaoCnh avaliador) {
        this.calculadora = calculadora;
        this.avaliador = avaliador;
    }

    public void registrar(Infracao infracao) {

        Motorista motorista = infracao.getVeiculo().getMotoristaResponsavel();

        int pontos = calculadora.calcularPontos(infracao);
        BigDecimal valor = calculadora.calcularValor(infracao);

        motorista.adicionarPontos(pontos);
        historico.add(infracao);

        SituacaoCnh situacao = avaliador.avaliar(motorista);

        System.out.println("=== Infração registrada ===");
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Tipo: " + infracao.getTipo());
        System.out.println("Pontos adicionados: " + pontos);
        System.out.println("Valor da multa: R$ " + valor);
        System.out.println("Total de pontos: " + motorista.getPontosAcumulados());
        System.out.println("Situação da CNH: " + situacao);
        System.out.println();
    }

    public List<Infracao> getHistorico() {
        return Collections.unmodifiableList(historico);
    }
}
