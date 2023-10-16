package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosporintervaloAnos = new ArrayList();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosporintervaloAnos.add(l);
                }
            }
        }
        return livrosporintervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro Um", "Autor Um", 1990);
        catalogoLivros.adicionarLivros("Livro Um", "Autor Dois", 1900);
        catalogoLivros.adicionarLivros("Livro Dois", "Autor Dois", 2000);
        catalogoLivros.adicionarLivros("Livro Três", "Autor Três", 2010);
        catalogoLivros.adicionarLivros("Livro Quatro", "Autor Quatro", 2023);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Quatro"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990,2009));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro Um"));


    }
}
