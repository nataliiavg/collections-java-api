package main.java.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // atributos
    private String nome;
    private int idade;
    private double alltura;

    public Pessoa(String nome, int idade, double alltura) {
        this.nome = nome;
        this.idade = idade;
        this.alltura = alltura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAlltura() {
        return alltura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", alltura: " + alltura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAlltura(), p2.getAlltura());
    }
}
