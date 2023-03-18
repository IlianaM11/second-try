
package ejercicioasteriscos;
import java.util.Scanner;
/**
 *
 * @author nissi
 */
public class EjercicioAsteriscos {
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int num1,num2,num3,num4;
        
    System.out.println("Ingrese Numero: "); 
     
    //while((numero>=0) && (numero<=20) || (contador>4)){;
        num1 =reader.nextInt();
        if(num1 >= 0  && num1<=20) {
           System.out.println(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*" );
        }  
        }else {
     System.out.println("Ingrese un numero entre 1 y 20");      
        
        }
        
    num2 =reader.nextInt();
        if(num2 >= 0  && num2<=20) {
           System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*" );
        }  
        }else {
     System.out.println("Ingrese un numero entre 1 y 20");      
        
        }
        
         num3 =reader.nextInt();
        if(num3 >= 0  && num3<=20) {
           System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*" );
        }  
        }else {
     System.out.println("Ingrese un numero entre 1 y 20");      
        }
        
         num4 =reader.nextInt();
        if(num4 >= 0  && num4<=20) {
           System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*" );
        }  
        }else {
     System.out.println("Ingrese un numero entre 1 y 20");  
     
     
        }
      }
    }