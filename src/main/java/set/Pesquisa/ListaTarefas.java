package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    final private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluido) {
        tarefaSet.add(new Tarefa(descricao, concluido));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }
        }

        tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getConcluido()) {
                    tarefasConcluidas.add(t);
                }
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.getConcluido()) {
                    tarefasPendentes.add(t);
                }
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (!t.getConcluido()) {
                        t.setConcluido(true);
                    }
                }
            }
        }
    }

    public  void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    if (t.getConcluido()) {
                        t.setConcluido(false);
                    }
                }
            }
        }
    }

    public void limparLista() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1", true);
        listaTarefas.adicionarTarefa("Tarefa 2", true);
        listaTarefas.adicionarTarefa("Tarefa 3", false);
        listaTarefas.adicionarTarefa("Tarefa 4", true);
        listaTarefas.adicionarTarefa("Tarefa 5", false);

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Tarefa 2");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Tarefa 2");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.marcarTarefaConcluida("Tarefa 2");

        listaTarefas.limparLista();
        listaTarefas.exibirTarefas();
    }
}
