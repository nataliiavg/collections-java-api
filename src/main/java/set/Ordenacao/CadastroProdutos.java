package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributo
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        //instanciação da classe CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        //Inserção dos dados
        cadastroProdutos.adicionarProduto(123556434L, "Produto 2", 15d, 10);
        cadastroProdutos.adicionarProduto(123234534L, "Produto 9", 45d, 1);
        cadastroProdutos.adicionarProduto(123556434L, "Produto 6", 4d, 15);
        cadastroProdutos.adicionarProduto(123234434L, "Produto 1", 100d, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
