
package ejercicio7java;
import java.util.Scanner;
/**
 *Implementar un programa que le pida dos números 
 * enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 * @author nissi
 */
public class Ejercicio7Java {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);
      int Num1, Num2;
      
       System.out.println("Ingrese el primer numero" );
         Num1 = reader.nextInt();
   
       System.out.println("Ingrese el Segundo numero" );        
         Num2 = reader.nextInt();
          
    if ((Num1>=25)) {        
        System.out.println(Num1 + "Es mayor o igual a 25" );
            if ((Num2>=25)) {
        System.out.println(Num2 + "Es mayor o igual a 25" );
    }
    }else{ 
    System.out.println( "el numero ingresado es menor a 25 ");
                 
        }         
    }    
           
}          