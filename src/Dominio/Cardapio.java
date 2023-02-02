package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String nome;
    private ArrayList<Lanche> lanches = new ArrayList<Lanche>();

    public Cardapio(String nome){
        this.nome=nome;
    }


    public List<Lanche> getLanches(){
        return lanches;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public int getTotalCarb(){
        int val=0;
        for(Lanche lan: lanches){
            val+=lan.getTotalCarb();
        }
        return val;
    }
    public int getTotalProt(){
        int val=0;
        for(Lanche lan: lanches){
            val+= lan.getTotalProt();
        }
        return val;
    }


    public void adicionaLanche(Lanche lan){
        this.lanches.add(lan);
    }


    @Override
    public String toString() {
        return "Dominio.Cardapio{" +
                "nome='" + nome + '\'' +
                ", lanches=" + lanches +
                '}';
    }
}
