package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // atributos
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
           throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(20);
        numeros.adicionarNumero(3);

        // Exibe os números adicionados
        numeros.exibirNumeros();

        // Exibe em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibe a lista
        numeros.exibirNumeros();

        // Exibe a lista em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibe a lista
        numeros.exibirNumeros();
    }
}
