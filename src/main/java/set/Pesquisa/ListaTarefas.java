package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio.");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase((descricao))) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        // Instanciação da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adição tarefas à lista
        listaTarefas.adicionarTarefa("Ir para a academia");
        listaTarefas.adicionarTarefa("Estudar Java Collections");
        listaTarefas.adicionarTarefa("Organizar o quarto");
        listaTarefas.adicionarTarefa("Ler");
        listaTarefas.adicionarTarefa("Preparar almoço");

        // Exibe as tarefas na lista
        listaTarefas.exibirTarefas();

        // Remove uma tarefa
        listaTarefas.removerTarefa("Organizar o quarto");
        listaTarefas.exibirTarefas();

        // Conta o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtém tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marca tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler");
        listaTarefas.marcarTarefaConcluida("Estudar Java Collections");

        // Obtém tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marca tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java Collections");
        listaTarefas.exibirTarefas();

        // Limpa a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }

}
