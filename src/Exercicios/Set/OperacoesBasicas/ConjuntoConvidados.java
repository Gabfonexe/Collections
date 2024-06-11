package Exercicios.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoNome){
        convidadoSet.add(new Convidado(nome, codigoNome));
    }

    public void remvoerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break; // para o laço pois so preciso de 1
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " Convidado(S) dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " Convidado(S) dentro do set de convidados");


        conjuntoConvidados.remvoerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " Convidado(S) dentro do set de convidados");



    }


}
