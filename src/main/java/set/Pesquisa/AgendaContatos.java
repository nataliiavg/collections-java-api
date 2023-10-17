package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Natalia", 123456);
        agendaContatos.adicionarContato("Natalia", 0);
        agendaContatos.adicionarContato("Natalia Graciano", 555333);
        agendaContatos.adicionarContato("Natalia Dev", 678943);
        agendaContatos.adicionarContato("Carolina Mendes", 555333);

        agendaContatos.exibirContato();

        // Pesquisa por nome "Natalia"
        System.out.println(agendaContatos.pesquisarPorNome("Natalia"));

        // Atualiza número de contato
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Carolina Mendes", 8888888));

        // Exibir lista completa atualizada
        agendaContatos.exibirContato();
    }
}
