package main.java.list.OperacoesBasicas;

public class Item {
    // atributos
    private String nome;
    private double preco;
    private int qtdd;

    public Item(String nome, double preco, int qtdd) {
        this.nome = nome;
        this.preco = preco;
        this.qtdd = qtdd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdd() {
        return qtdd;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdd=" + qtdd +
                '}';
    }
}
