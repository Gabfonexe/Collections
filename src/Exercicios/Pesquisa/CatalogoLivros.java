package Exercicios.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosporAutor = new ArrayList<>();
        if(!livroList.isEmpty()){ // se não estiver vazio
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){ // se autor do livro for igual autor do parametro
                    livrosporAutor.add(l);
                }
            }

        }
        return  livrosporAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return  livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null; // aqui não crio uma lista pois o enunciado pede somente o primeiro livro encontrado
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break; // uso o break pois deve retornar somente o primeiro livro encontrado
                }
            }
        }
        return  livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));

    }

}
