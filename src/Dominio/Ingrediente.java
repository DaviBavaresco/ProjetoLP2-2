package Dominio;

public class Ingrediente {
    private int quantidade;
    private Condimento condimento;
    private int total=0;

<<<<<<< HEAD
    public Ingrediente(int quantidade, Condimento condimento) {
=======
    public Ingrediente( Condimento condimento,int quantidade ) {
>>>>>>> 503fe3d (Initial commit)
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
