package Exercicios.Pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String autor, String titulo, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString(){
        return "Livro: " + getTitulo() + "/ Autor: " + getAutor() + "/ Ano: " + getAnoPublicacao() ;
    }
}
