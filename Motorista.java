package Controle_Multas;

public class Motorista {
    private final String nome;
    private final String numeroCnh;
    private int pontosAcumulados;

    public Motorista(String nome, String numeroCnh) {
        this.nome = nome;
        this.numeroCnh = numeroCnh;
        this.pontosAcumulados = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCnh() {
        return numeroCnh;
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void adicionarPontos(int pontos) {
        this.pontosAcumulados += pontos;
    }

    public void setPontosAcumulados(int pontos) {
        this.pontosAcumulados = pontos;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", numeroCnh='" + numeroCnh + '\'' +
                ", pontosAcumulados=" + pontosAcumulados +
                '}';
    }
}
