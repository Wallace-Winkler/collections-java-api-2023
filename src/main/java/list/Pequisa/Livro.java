package main.java.list.Pequisa;

public class Livro {
    private String livro;
    private String autor;
    private int anoDePublicacao;

    public Livro(String livro, String autor, int anoDePublicacao) {
        this.livro = livro;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return livro + " - " + autor + " - " + anoDePublicacao;
    }
}
