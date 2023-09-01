package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItens(String nome) {
        List<Item> deleteItens = new ArrayList<>();

        for(Item i : itens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                deleteItens.add(i);
            }
        }

        itens.removeAll(deleteItens);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Item i : itens) {
            if (i.getPreco() > 0) {
                valorTotal += i.getPreco();
            }
        }

        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras items = new CarrinhoDeCompras();
        items.adicionarItem("Notebook", 2500, 2);
        items.adicionarItem("PlayStation5", 4199, 1);

        items.removerItens("Notebook");

        System.out.println(items.calcularValorTotal());

        items.exibirItens();
    }
}
