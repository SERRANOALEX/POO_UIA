
///********PRACTICA 6 *******
///++++++EJERCICIO 1 +++++++

import java.util.Scanner; 
public class Practica6 {
    public static void main(String[] args){
      
      int sum = 0, inputNum;
      int contador;
      float num;
      int x = 0;
      Scanner NumScanner = new Scanner(System.in);
      Scanner charScanner = new Scanner(System.in); 
      System.out.println("CANTIDAD NUMEROS PARA CALCULAR MEDIA"); 
      contador = NumScanner.nextInt(); 
      System.out.println("INGRESA " + contador + " NUMEROS"); 
      for( x = 1; x<=contador ;x++){          
      inputNum = NumScanner.nextInt();
      sum = sum + inputNum;
      System.out.println();
      } 
      num = sum / contador;
      System.out.println("LA MEDIA DE " + contador + " NUMEROS ES " + num);
    }
}
