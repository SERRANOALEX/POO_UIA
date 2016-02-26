
//EJERCICIO 1

public class Miaplicacion{
	public static void main (String[] args)
	{
	int a = 10, b = 3, c = 1, d, e;
	float x, y;
	
	x = a/b;
	//c = a < b && c;
	d = a+ b++;
	e = ++a - b;
	y =  a/b;

	System.out.println("EL VALOR DE X ES: " + x);
    System.out.println("EL VALOR DE D ES: " + d);
    System.out.println("EL VALOR DE E ES: " + e);
    System.out.println("EL VALOR DE Y ES: " + y);
    System.out.println("EL VALOR DE C ES: " + c);

if( a > b ) 
System.out.println("EL MAYOR ES: " + a); 
else 
	if( a < c )
System.out.println("EL MAYOR ES: " + c); 
else 
	if( b > c ) 
System.out.println("EL MAYOR ES: " + b); 
else 	
System.out.println("EL MAYOR ES: " + c); 
} 
} 

*/
//EJERCICIO 2
/*
public class Miaplicacion{
  public static void main (String[] args){ 
float a = 1, b = 5, c = 2;
float x,y,z,r,p,q; 
float resultado;

x = b * b; //b^2 = 25
y = a * c;//2*1  =  2
z = -4 *y;//-4+2 = -2
p = a * 2;//2*1  =  2
q = x + z;//25-2  = 23
resultado = q/p;//11 O 12

System.out.println("EL RESULTADO ES: " + resultado);
System.out.println(" X VALE: " + x);
System.out.println(" Y VALE: " + y);
System.out.println(" P VALE: " + p);
System.out.println(" Z VALE: " + z);
System.out.println(" Q VALE: " + q);
  }
}
*/
//EJERCICIO 3
/*
import  java.util.Random;
import java.util.Scanner;
public class Miaplicacion{
	public static void main(String[]args){
Random r = new Random();
Scanner sc = new Scanner(System.in);
int a, b, c, i, suma = 0;
int multiplo = 0;
int limit=0;
int num=0,res=0;
do{
System.out.println(" VALOR DE A");
a = sc.nextInt();
}
while (a < 0);
do{
System.out.println("VALOR DE B");

b = sc.nextInt();	
String cadena = " ";
for(i = a; i <= b; i++){
	if(i%5 ==0){
		cadena = cadena+i+"-";
	}
}
System.out.println( "MULTIPLOS DE 5 SON" +cadena);
res = b+i;
System.out.println(" LA SUMA DE LOS MULTLOS DE 5 ES:"+ res); 
  
}while (b < 0);
if(a>b){
c = a;
a = b;
b = c;
}
for (i = a; i<b; i++){
if (i%5 == 0){
suma = suma+i;
}
//System.out.println("suma"+ suma + i);	
}
}
}

//public String getNombre( ){
  //  return this.nombre;
  //}
  */
//EJERCICO 4
/*
import  javax.swing.JOptionPane;
import  java.util.Random;


public class  Miaplicacion{

    public static void main(String[] args)
    {
Random r = new Random();
		int numero = r.nextInt(15); 
		int i ; 
		int posible = input("ADIVINA EL NUMERO ENTRE 1 Y 15");
		while (numero != posible) { 
		for ( i = 1; i < 15; i++) 
          	if(i != posible){
        System.out.println("ERROR");  		
        }
        		else{
          		System.out.println("INGRESA OTRO NUMERO");          
        	}        
			if (numero > posible) {
				posible = input("EL MUMERO DEBE SER MAS GRANDE \n");
			} else {
				posible = input("EL NUMERO DEBE SER MAS CHICO \n");
			}
		}
		JOptionPane.showMessageDialog(null, "  SI EL NUMERO  PENSADO FUE =  "  + posible);
	}
	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));	
	}
}

*/





