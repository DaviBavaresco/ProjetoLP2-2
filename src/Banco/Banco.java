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

    public static void criaCondimento() {
        Condimento c;
        c=new Condimento("Arroz",2,7);
        condimentos.add(c);
        c= new Condimento("Frango",7,3);
        condimentos.add(c);
        c= new Condimento("Feijão",3,3);
        condimentos.add(c);
        c= new Condimento("Carne",10,3);
        condimentos.add(c);
        c= new Condimento("Batata",3,5);
        condimentos.add(c);
        c= new Condimento("Mamão",1,2);
        condimentos.add(c);
        c= new Condimento("Pão",1,5);
        condimentos.add(c);
        c= new Condimento("Café",1,1);
        condimentos.add(c);
    };
    public static void criaIngrediente() {
        Ingrediente i;
        i= new Ingrediente(condimentos.get(0),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(2),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(3),100);
        ingredientes.add(i);

        i= new Ingrediente(condimentos.get(0),200);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(2),150);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(3),150);
        ingredientes.add(i);

        i= new Ingrediente(condimentos.get(0),300);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(2),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(3),100);
        ingredientes.add(i);

        i= new Ingrediente(condimentos.get(0),400);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(2),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(3),100);
        ingredientes.add(i);

        i= new Ingrediente(condimentos.get(7),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(6),100);
        ingredientes.add(i);

        i= new Ingrediente(condimentos.get(5),100);
        ingredientes.add(i);
        i= new Ingrediente(condimentos.get(7),100);
        ingredientes.add(i);

    };

    public static void criaLanche() {
        Lanche l;
        l= new Lanche("almoço 1");
        l.adicionaIngrediente(ingredientes.get(0));
        l.adicionaIngrediente(ingredientes.get(1));
        l.adicionaIngrediente(ingredientes.get(2));
        lanches.add(l);

        l= new Lanche("almoço 2");
        l.adicionaIngrediente(ingredientes.get(3));
        l.adicionaIngrediente(ingredientes.get(4));
        l.adicionaIngrediente(ingredientes.get(5));
        lanches.add(l);

        l= new Lanche("janta 1");
        l.adicionaIngrediente(ingredientes.get(6));
        l.adicionaIngrediente(ingredientes.get(7));
        l.adicionaIngrediente(ingredientes.get(8));
        lanches.add(l);

        l= new Lanche("janta 2");
        l.adicionaIngrediente(ingredientes.get(9));
        l.adicionaIngrediente(ingredientes.get(10));
        l.adicionaIngrediente(ingredientes.get(11));
        lanches.add(l);

        l= new Lanche("cafe 1");
        l.adicionaIngrediente(ingredientes.get(12));
        l.adicionaIngrediente(ingredientes.get(13));
        lanches.add(l);

        l= new Lanche("cafe 2");
        l.adicionaIngrediente(ingredientes.get(14));
        l.adicionaIngrediente(ingredientes.get(15));
        lanches.add(l);

    };

    public static void criaCardapio() {
        Cardapio cc;
        cc= new Cardapio("Cardapio 111");
        cc.adicionaLanche(lanches.get(4));
        cc.adicionaLanche(lanches.get(0));
        cc.adicionaLanche(lanches.get(2));
        cardapios.add(cc);

        cc= new Cardapio("Cardapio 112");
        cc.adicionaLanche(lanches.get(4));
        cc.adicionaLanche(lanches.get(0));
        cc.adicionaLanche(lanches.get(3));
        cardapios.add(cc);

        cc= new Cardapio("Cardapio 121");
        cc.adicionaLanche(lanches.get(4));
        cc.adicionaLanche(lanches.get(1));
        cc.adicionaLanche(lanches.get(2));
        cardapios.add(cc);

        cc= new Cardapio("Cardapio 211");
        cc.adicionaLanche(lanches.get(5));
        cc.adicionaLanche(lanches.get(0));
        cc.adicionaLanche(lanches.get(2));
        cardapios.add(cc);

    };

}
