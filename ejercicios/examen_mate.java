
public class examen_mate{  
  public double funcion(double x){
      // CALCULA LA SIGUIENTE FUNCIÓN:
       return x*x*x + 4*(x*x) -10;
   }
   /**
    * Halla el valor de la raiz de la función: x^3+4x^2-10=0
    * Por el método de biseccion 
    */
   public double metodoDeBiseccion(double a, double b){
       double error=0.003;
       double c = 0.0;
       double fa;
       double fb;
       double fc;
       if((funcion(a) * funcion(b)) > 0){
           System.out.println("Error en el intervalo, en ese intervalo no existen raices");}
       else{
            c = (a + b) /(double) 2;
           do{
              
               fa = funcion(a);
               fb = funcion(b);
               fc = funcion(c);
               if((fa * fc) > 0){
                   a = c;
                   fa = funcion(a);
                   fb = funcion(b);
                    c = (a + b) /(double) 2;
                   fc = funcion(c);
               }else if((fb * fc) > 0 ){
                   b = c;
                   fa = funcion(a);
                   fb = funcion(b);
                    c = (a + b) /(double) 2;
                   fc = funcion(c);
               }
           }while(Math.abs(fc) >= error);
       }
       System.out.println("El valor de la raiz de la función x^3+4x^2-10=0 es: "+c);
       return  c;
    }
}