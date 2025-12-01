package Controle_Multas;

public class Veiculo {

    private final String placa;
    private final String modelo;
    private final Motorista motoristaResponsavel;

    public Veiculo(String placa, String modelo, Motorista motoristaResponsavel) {
        this.placa = placa;
        this.modelo = modelo;
        this.motoristaResponsavel = motoristaResponsavel;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Motorista getMotoristaResponsavel() {
        return motoristaResponsavel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motoristaResponsavel=" + motoristaResponsavel.getNome() +
                '}';
    }
}
