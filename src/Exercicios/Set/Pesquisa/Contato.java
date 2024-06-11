package Exercicios.Set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numero;


    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public String toString(){
        return "Contato: " + nome + "Número: " + numero;
    }
}
