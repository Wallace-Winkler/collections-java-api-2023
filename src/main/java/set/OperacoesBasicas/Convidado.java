package main.java.set.OperacoesBasicas;

public class Convidado {
    private String nomeConvidado;
    private int codigoConvidado;

    public Convidado(String nomeConvidado, int codigoConvidado) {
        this.nomeConvidado = nomeConvidado;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return nomeConvidado + " - " + codigoConvidado;
    }
}
