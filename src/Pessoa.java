import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private int idade;
    private ArrayList<Lanche> lanches= new ArrayList<Lanche>();

    public Pessoa(String nome, double peso, double altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public void AdicionaLanche(Lanche lan){
        this.lanches.add(lan);
    };


    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", idade=" + idade +
                ", lanches=" + lanches +
                '}';
    }
}
