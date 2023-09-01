package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenacaoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);

        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparePorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoas("Pessoa 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoas("Pessoa 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoas("Pessoa 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoas("Pessoa 4", 17, 1.50);

        System.out.println(ordenacaoPessoa.ordenacaoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
