package StreamAPI.Desafios;

import java.util.Arrays;
import java.util.List;

public class ex07 {

  public static void main(String[] args) {
    
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int m = 0;

    for (Integer num : numeros){
      m++;
    }

    numeros.forEach(n ->{
      numeros.sort(null);
      
      if (n > numeros.indexOf(n)){
        
      }

    });
  }
  
}
