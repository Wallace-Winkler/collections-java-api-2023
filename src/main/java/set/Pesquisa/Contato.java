package main.java.set.Pesquisa;

public class Contato {
    private String nome;
    private String contato;

    public Contato(String nome, String contato){
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString(){
        return nome + " - " + contato;
    }
}
