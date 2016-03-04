

//********PRACTICA 5 **********
 
 //+++EJERCICIO 1+++

import java.io.*;
public class Practica5{                 //lista de excepciones
  public static void main(String[]args)throws IOException{

        int i;
        String entrada;
        String salida;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" FRASE A ROTAR");
        entrada=br.readLine();
        for(i=0;i<=entrada.length()-1;i++){
        entrada=entrada.charAt(entrada.length()-1)+ entrada.substring(0,entrada.length()-1);
            //devulve el primer caracter de una cadena
        System.out.println(entrada);                    //crea objeto que combina dos cadenas       
        }       
    }
}


//+++++++++EJERCICIO 2 +++++++
/*
import java.io.*;
public class Practica5{
 public static void main(String[] args) {
  
  final char eof = (char) - 1;
  char car;
  boolean palabra = false;
  int caracteres = 0;
  int pal = 0;
  int linea = 0;
  try  {
  System.out.println("INTRODUZCA TEXTO " + "PULSE [ENTER] DESPUES DE CADA LINEA.");
  System.out.println("PARA TERMINAR Ctrl+z Y ENTER \n");
  while ((car = (char)System.in.read()) != eof)   {    
  if (car == '\r') continue;
  caracteres++; 
  if (car == ' ' || car == '\n' || car == '\t')
  palabra  = false;
  else if (!palabra){
  pal++; 
  palabra = true;
  }
  if (car == '\n')
  linea++;
  }
  System.out.println();
  System.out.println(" CARACTERES "+caracteres + " " + " PABLABRAS " + pal + " " + " LINEAS " + linea);
  }
  catch(IOException ignorada){}
 }   
}

*/
