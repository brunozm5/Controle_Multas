package Controle_Multas;

import java.util.Date;

public class Infracao {

    private final TipoInfra tipo;
    private final Veiculo veiculo;
    private final Date data;

    public Infracao(TipoInfra tipo, Veiculo veiculo, Date data) {
        this.tipo = tipo;
        this.veiculo = veiculo;
        this.data = data;
    }

    public TipoInfra getTipo() {
        return tipo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Infracao{" +
                "tipo=" + tipo +
                ", veiculo=" + veiculo.getPlaca() +
                ", data=" + data +
                '}';
    }
}
