package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros>{
    final private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    @Override
    public int compareTo(OrdenacaoNumeros n1) {
        return Integer.compare(numerosList.get(0), n1.numerosList.get(1));
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ascendente = new ArrayList<>(numerosList);

        Collections.sort(ascendente);
        return ascendente;
    }

    public List<Integer> ordenarDecrecente() {
        List<Integer> decrecente = new ArrayList<>(numerosList);

        Collections.reverse(decrecente);
        return decrecente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(50);
        ordenacaoNumeros.adicionarNumero(72);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDecrecente());

    }

}
