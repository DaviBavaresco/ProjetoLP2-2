package Dominio;

public class Ingrediente {
    private int quantidade;
    private Condimento condimento;
    private int total=0;

    public Ingrediente(int quantidade, Condimento condimento) {
        this.quantidade = quantidade;
        this.condimento = condimento;
    }

    public int TotalProt(){
      return total= quantidade*condimento.getProteina();
    };
    public int TotalCarb(){
      return total=quantidade*condimento.getCarboidrato();
    };

    @Override
    public String toString() {
        return "Dominio.Ingrediente{" +
                "quantidade=" + quantidade +
                ", condimento=" + condimento +
                '}';
    }
}
