package Banco;
import Dominio.Cardapio;
import Dominio.Condimento;
import Dominio.Ingrediente;
import Dominio.Lanche;
import Dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static List<Cardapio> cardapios= new ArrayList<Cardapio>();
    public static List<Condimento> condimentos= new ArrayList<Condimento>();
    public static List<Ingrediente> ingredientes= new ArrayList<Ingrediente>();
    public static List<Lanche> lanches= new ArrayList<Lanche>();
    public static List<Pessoa> pessoas= new ArrayList<Pessoa>();

    public void CriaCondimento(){
        Condimento c;
        c=new Condimento("Batata",12,2);
        condimentos.add(c);
        c=new Condimento("Arroz",10,2);
        condimentos.add(c);
        c=new Condimento("Massa",15,5);
        condimentos.add(c);
        c=new Condimento("Carne",3,10);
        condimentos.add(c);
        c=new Condimento("Frango",2,20);
        condimentos.add(c);
        c=new Condimento("Camarão",1,12);
        condimentos.add(c);
    }

}
