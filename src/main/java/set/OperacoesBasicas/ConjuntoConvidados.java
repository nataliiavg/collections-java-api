package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemocao = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemocao = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemocao);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        // instanciação da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        // Adicionando convidados
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1002);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1003);

        // Exibe a quantidade de candidatos
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        // Remove candidato pelo seu respectivo código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1003);
        // Exibe quantidade de convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

         //Exibe as informações dos candidatos
        conjuntoConvidados.exibirConvidados();
    }
}
