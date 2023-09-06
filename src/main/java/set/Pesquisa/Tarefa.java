package main.java.set.Pesquisa;

public class Tarefa {
    /* Crie uma classe chamada "ListaTaredas" que possui um conjunto de objetos do tipo "Tarefa" como
    atributo. Cada tarefa possui uma descrição e um atributo boaleano para indicar se a tarefa foi
    concluida ou não. Implemente os seguintes metodos

    adicionar nova tarefa
    remover tarefa
    exibir tarefas
    contar tarefas
    obter tarefas concluidas
    obter tarefas pendentes
    marcar tarefas concluidas
    marcar taredas pendentes
    limpar lista de tarefas */

    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return  descricao;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean getConcluido() {
        return concluido;
    }

    @Override
    public String toString() {
        return descricao + " - " + concluido;
    }
}
