package StreamAPI.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ex06 {
  public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    numeros.forEach(n ->  {
      if(n > 10){
        System.out.println(n);
      }
    });

  }
}