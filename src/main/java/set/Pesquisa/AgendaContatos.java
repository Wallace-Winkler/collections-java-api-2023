package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String contato) {
        contatos.add(new Contato(nome, contato));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> nomesEncontrados = new HashSet<>();

        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().startsWith(nome)){
                    nomesEncontrados.add(c);
                }
            }
        }

        return nomesEncontrados;
    }

    public void atualizarContato(String nome, String novoNumero) {
        if (!contatos.isEmpty()) {
            for (Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setContato(novoNumero);
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Wallace", "67996998253");
        agendaContatos.adicionarContato("Mi", "67996998255");
        agendaContatos.adicionarContato("mae", "67996975226");
        agendaContatos.adicionarContato("pai", "67996127663");

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("mae"));
        agendaContatos.atualizarContato("mae", "67996998253");
        System.out.println(agendaContatos.pesquisarPorNome("mae"));
    }
}