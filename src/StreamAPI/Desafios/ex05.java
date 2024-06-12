package StreamAPI.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex05 {
  public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> novaLista = new ArrayList<>();
    
    numeros.forEach(n ->{
      if(n > 5){
        novaLista.add(n);
      }
    });
    
    int qtd = novaLista.size();
    double resultado = novaLista.stream().reduce(0, Integer::sum);
    System.out.println(resultado / qtd);
    
  }
  
}
