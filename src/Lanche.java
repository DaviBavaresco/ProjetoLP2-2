import java.util.ArrayList;
import java.util.List;

public class Lanche {
    private String nome;
    private boolean favorito=true;

    private int total=0;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();



    public Lanche(String nome){
        this.nome=nome;
    }


    public void AdicionarIngrediente(Ingrediente ingre){
    this.ingredientes.add(ingre);
    }

    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public int getTotalCarb(){
        int val =0;
        for (Ingrediente ing : ingredientes){
            val=val+ing.TotalCarb();
        }
        return val;
    }

    public int getTotalProt(){
        int val = 0;
        for(Ingrediente ing: ingredientes){
            val+=ing.TotalProt();
        }
        return val;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + nome + '\'' +
                ", favorito=" + favorito +
                ", carb=" + getTotalCarb() +
                ", prot=" + getTotalProt()+
                ", ingredientes=" + ingredientes +
                '}';
    }
}