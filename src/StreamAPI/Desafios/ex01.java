package StreamAPI.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ex01 {
  
  List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

  //Predicate<Integer> maisDeCincoCaracteres = numero -> numero.compareTo(numeros) ;

   Function<Integer, Integer> ordenar = numero -> numero * 2;

}
