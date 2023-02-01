package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Lanche {
    private String nome;


    private int total=0;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();



    public Lanche(String nome){
        this.nome=nome;
    }


<<<<<<< HEAD
    public void AdicionarIngrediente(Ingrediente ingre){
    this.ingredientes.add(ingre);
=======
    public void adicionaIngrediente(Ingrediente i){
    this.ingredientes.add(i);
>>>>>>> 503fe3d (Initial commit)
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



    @Override
    public String toString() {
        return "Dominio.Lanche{" +
                "nome='" + nome + '\'' +

                ", carb=" + getTotalCarb() +
                ", prot=" + getTotalProt()+
                ", ingredientes=" + ingredientes +
                '}';
    }
}
