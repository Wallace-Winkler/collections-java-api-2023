package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite) {
        convidadoSet.add(new Convidado(nome, convite));
    }

    public void removerConvidadoPorCodigoConvite( int convite ) {
        if(!convidadoSet.isEmpty()){
            Convidado convidadoParaRemover = null;

            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvidado() == convite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Dentro do set convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2212);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 2215);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "Dentro do set convidados");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "Dentro do set convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
