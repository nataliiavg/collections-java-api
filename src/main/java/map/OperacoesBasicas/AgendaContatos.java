package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroTelefone = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroTelefone = agendaContatosMap.get(nome);
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        // instânciação da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Inserção de dados para testar os métodos
        agendaContatos.adicionarContato("Natalia", 123456);
        agendaContatos.adicionarContato("Natalia", 333);
        agendaContatos.adicionarContato("Natalia Graciano", 999999);
        agendaContatos.adicionarContato("Natalia FS Developer", 3467896);
        agendaContatos.adicionarContato("Carolina Mendes", 999999);
        agendaContatos.adicionarContato("Natalia", 55555);

        // Exibe os contatos
        agendaContatos.exibirContatos();

        // Remove um contato e exibe os contatos atualizados
        agendaContatos.removerContato("Carolina Mendes");
        agendaContatos.exibirContatos();

        // Pesquisa pelo nome do contato e exibe telefone correspondente
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Natalia FS Developer"));
    }
}
