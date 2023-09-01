package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adiocionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover= new ArrayList<>();

        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obeterDescricoesTaredas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adiocionarTarefa("Tarefa1");
        listaTarefa.adiocionarTarefa("Tarefa1");
        listaTarefa.adiocionarTarefa("Tarefa3");

        //listaTarefa.removerTarefa("Tarefa1");

        listaTarefa.obeterDescricoesTaredas();

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
