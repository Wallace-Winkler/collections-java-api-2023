package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        contatosMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public void pesquisarPorNome(String nome) {
        if (!contatosMap.isEmpty()){
            System.out.println(contatosMap.get(nome));
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wallace", 996998253);
        agendaContatos.adicionarContato("Valter", 996999993);
        agendaContatos.adicionarContato("Winkler", 123456789);
        agendaContatos.adicionarContato("Ceta", 987654321);

        agendaContatos.removerContato("Ceta");

        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Valter");
    }
}
