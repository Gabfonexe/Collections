package StreamAPI.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex04 {
  public static void main(String[] args) {
    

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> novaLista = new ArrayList<>();
    numeros.forEach(n ->{
      if(n % 2 == 0){
        novaLista.add(n);
      }
    });
    System.out.println(novaLista);
  }
}
