package main.java.list.Pequisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;
    private int maior = 0;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        if (!numerosList.isEmpty()){
            for (Integer n : numerosList) {
                soma += n;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero() {

        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (maior < n) {
                    maior = n;
                }
            }
        }

        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = maior;

        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (menor > n) {
                    menor = n;
                }
            }
        }

        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numerosList;
    }

    public static void main(String[] args) {
        SomaNumeros numerosLista = new SomaNumeros();

        numerosLista.adicionarNumero(1);
        numerosLista.adicionarNumero(2);
        numerosLista.adicionarNumero(5);
        numerosLista.adicionarNumero(10);
        numerosLista.adicionarNumero(20);

        System.out.println(numerosLista.calcularSoma());
        System.out.println(numerosLista.encontrarMaiorNumero());
        System.out.println(numerosLista.encontrarMenorNumero());
        System.out.println(numerosLista.exibirNumeros());
    }
}
