
  public class var_local_global {

        byte verdadero = 1;
        short diez = 10;       
        long veinte = 20;       
        char consonante = 'P';
        int cuarenta = 40;
        double  algo = 2016;
        float mitad = 50.50F;
       
   
    public static void main(String[] args) {
       var_local_global c = new var_local_global();
        byte binario = 2;
       short corto = 200;       
       long largo = 459;       
       char letra = 'A';
       int entero = 300; 
       double  doble = 20.8;
       String mensaje = "HELLO, WORLD";      
       
        
        System.out.println("VARIABLES GLOBALES");
        
        System.out.println("BYTE VALE:");
        System.out.println(c.verdadero);
        System.out.println("SHORT VALE:");
        System.out.println(c.diez);
        System.out.println("LONG VALE:" );
        System.out.println(c.veinte);
        System.out.println("CHAR ES UNA LETRA:\n" );
        System.out.println(c.consonante);
        System.out.println("INT VALE:\n" );
        System.out.println(c.cuarenta);
        System.out.println("DOUBLE VALE:\n" );
        System.out.println(c.algo);
      System.out.println("FLOAT VALE:\n" );
        System.out.println(c.mitad);

         System.out.println("VARIABLES LOCALES\n");
        System.out.println("\n");       
        System.out.println("BYTE VALE:\n");
        System.out.println(binario);
        System.out.println("SHORT VALE:\n");
        System.out.println(corto);
        System.out.println("LONG VALE:\n");
        System.out.println(largo);
        System.out.println("CHAR ES UNA LETRA:\n");
        System.out.println(letra);
        System.out.println("INT VALE:\n");
        System.out.println(entero);
        System.out.println("DOUBLE VALE:\n");
        System.out.println(doble);
        System.out.println("STRING ES:\n" + mensaje);
    }
}
        
    