package Controle_Multas;

public class DefaultAvaliadorSituacaoCnh implements AvaliadorSituacaoCnh {

    @Override
    public SituacaoCnh avaliar(Motorista motorista) {
        int pontos = motorista.getPontosAcumulados();

        if (pontos >= 20) return SituacaoCnh.SUSPENSA;
        if (pontos >= 10) return SituacaoCnh.EM_RISCO;
        return SituacaoCnh.REGULAR;
    }
}
