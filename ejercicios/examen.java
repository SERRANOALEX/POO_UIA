import java.util.Scanner;
public class examen{
public static void main (String[]args){
Scanner t = new Scanner(System.in);
int valor = 0;
int [] arreglo = new int [10];

for (int i = 0; i<arreglo.length; i++){
System.out.println("VALOR " + ( i+1));
valor = t.nextInt();
arreglo[i] = valor;
}
for(int i : arreglo  ){
System.out.println( valor + " < " );
}
}
}






























/*

import javax.swing.*;

public class examen {
   
    public static double f (double x) {
        double rta;
        rta= Math.pow(x,3) + 4 * Math.pow(x,2) -10;
        return (rta);
    }

    public static void main(String[] args) {
        
        double a, b, p;
        double tol=0.0001;
        boolean sw=true;

        a= Double.parseDouble(JOptionPane.showInputDialog("Deme el valor de a?"));
        b= Double.parseDouble(JOptionPane.showInputDialog("Deme el valor de b?"));

                if (f(a)*f(b) <0) {

            do {
                p= (b-a)/2 + a;
                JOptionPane.showMessageDialog(null, "Valor de p:" + p + " - Valor de f(p):" + f(p));
                if (f(p)==0) {
                    JOptionPane.showMessageDialog(null, "La raiz es: " + p);
                    sw=false;
                }
                else if (f(a) * f(p) >0) {
                         a=p;
                      }
                     else {
                         b=p;
                     }

            } while ((sw) && (Math.abs(f(p))>tol));

           if (sw)
              JOptionPane.showMessageDialog(null, "Valor cercano a la raiz:" + p);
        }
        else
              JOptionPane.showMessageDialog(null, "En ese intervalo no se asegura una raiz f(a)=" + f(a) + " - f(b)=" + f(b));
    }
}
*/