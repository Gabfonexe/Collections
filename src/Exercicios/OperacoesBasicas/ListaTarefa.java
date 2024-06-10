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
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // criando uma lista
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

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa(); // Não preciso colocar o diammond pq a minha classe ja está como <>

        System.out.println("O número Total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número Total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número Total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas(); // fiz override no toString da classe Tarefa
    }
}
