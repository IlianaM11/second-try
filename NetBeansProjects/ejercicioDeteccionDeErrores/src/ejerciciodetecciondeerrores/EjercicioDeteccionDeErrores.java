/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodetecciondeerrores;
import java.util.Scanner;
/**
 *
 * @author nissi
 */
public class EjercicioDeteccionDeErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
   Scanner reader = new Scanner(System.in);
   int edad;
   String nombre;
        
    System.out.println("Ingresa tu nombre");
    nombre = reader.nextLine();
    
    System.out.println("Ingresa tu edad");
    edad = reader.nextInt();
    
    System.out.println( "Su nombre es:     "  + nombre );
        System.out.println( "Su edad es:     "  + edad );
}
}
    
    
