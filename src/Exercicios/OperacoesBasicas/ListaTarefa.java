package Exercicios.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    /* Aqui eu não uso o construtor passando o parametro pois devo fazer com que o atributo da classe ListaTarefa receba
    * um novo array de lista, conforme visto abaixo: */

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>(); // arraylist vazio

    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); // instanciando um novo obj com o parametro utilizado

    }

    public void  removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){ // se a descrição de tarefa for igual a descrição do parametro
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // aqui uso o removeAll pois pode haver elementos repetidos
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}
// teste