package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }

        } else {
            System.out.println("O conunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        // Instanciação da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adição de linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Typescript");
        conjuntoLinguagens.adicionarPalavra("C");
        conjuntoLinguagens.adicionarPalavra("C#");
        conjuntoLinguagens.adicionarPalavra("Python");

        // Exibe as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Remove uma linguagem no conjunto e exibe conjunto
        conjuntoLinguagens.removerPalavra("Typescript");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Remove linguagem inexistente no conjunto
        conjuntoLinguagens.removerPalavra("Ruby");

        // Verifica se uma linguagem está no conjunto
        System.out.println("A linguagem 'JavaScript' está no conjunto? " + conjuntoLinguagens.verificarPalavra("JavaScript"));
        System.out.println("A linguagem 'Ruby' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Ruby"));

        // Exibe as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

    }


}
