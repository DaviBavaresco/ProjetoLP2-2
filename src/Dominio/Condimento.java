package Dominio;

public class Condimento {
    private String nome;
    private int carboidrato;
    private int proteina;

    public Condimento(String nome, int carboidrato, int proteina) {
        this.nome = nome;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(int carboidrato) {
        this.carboidrato = carboidrato;
    }

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }

    @Override
    public String toString() {
        return "Dominio.Condimento{" +
                "nome='" + nome + '\'' +
                ", carboidrato=" + carboidrato +
                ", proteina=" + proteina +
                '}';
    }
}
