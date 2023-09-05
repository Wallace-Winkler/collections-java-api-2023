package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;

        if (!palavra.isEmpty()) {
            for (Palavra p : palavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                    break;
                }
            }
        }

        palavras.remove(palavraParaRemover);
    }

    public Palavra verificarPalavra(String palavra) {
        Palavra palavraAchada = null;

        if (!palavra.isEmpty()) {
            for (Palavra p : palavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)){
                    palavraAchada = p;
                    break;
                }
            }
        }

        return palavraAchada;
    }

    public void exibirPalavras() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra4");

        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("palavra3"));
        conjuntoPalavrasUnicas.removerPalavra("palavra3");
        conjuntoPalavrasUnicas.exibirPalavras();
    }
}
