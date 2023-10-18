package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()){
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunoSet.isEmpty()){
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Instanciação da classe GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Inserção dos dados
        gerenciadorAlunos.adicionarAluno("Jorge Henrique", 2315221L, 8);
        gerenciadorAlunos.adicionarAluno("Joana Lúcia", 2312321L, 10);
        gerenciadorAlunos.adicionarAluno("Franciele Almeida", 2128321L, 6);
        gerenciadorAlunos.adicionarAluno("Matheus Soares", 2124521L, 4);

        // Exibe todos os alunos
        System.out.println("Alunos no gerenciador: ");
        System.out.println(gerenciadorAlunos.alunoSet);

        // Remove um aluno com matrícula inválida e pelo número da matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(777L);
        gerenciadorAlunos.removerAlunoPorMatricula(2124521L);
        System.out.println(gerenciadorAlunos.alunoSet);

        // Exibe os alunos por nome em ordem alfabética
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibe alunos por ordem de nota ascendente
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}


