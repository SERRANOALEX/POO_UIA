import java.io.*; 
import java.util.Scanner; 

public class calculadora { 
     public static void main (String [] args) { 
          int opc = 0;

          float num1, num2,suma,resta,mul,div; 
          Scanner entrada = new Scanner(System.in); 
         
          System.out.println ("CALCULADORA\n"); 
          System.out.println (" 1 SUMA\n"); 
          System.out.println (" 2 RESTA\n"); 
          System.out.println (" 3 MULTIPLICACION\n");
          System.out.println (" 4 DIVISION\n");
          System.out.println (" 0 PARA SALIR \n");
          
          opc = entrada.nextInt(); 
          System.out.println ("\n NUMERO 1 \n"); 
          num1 = entrada.nextInt(); 
          System.out.println ("\n NUMERO 2 \n"); 
          num2 = entrada.nextInt();         
         

switch(opc){ 
case 0:       
       System.out.println ("\n SALIO DE LA CALCULADORA\n " ); 
       break;
case 1: 
       suma = num1 + num2; 
       System.out.println ("\n LA SUMA ES\n " +suma); 
       break; 
case 2:
       resta = num1 - num2; 
       System.out.println ("\n LA RESTA ES \n" +resta); 
       break; 
case 3:
     mul = num1 * num2; 
     System.out.println ("\n LA MULTIPLICACION ES\n " +mul); 
      break;      
case 4:
     div = num1 / num2; 
     System.out.println ("\n LA DIVICION ES \n" +div);  
     break;
} 
}
} 
  