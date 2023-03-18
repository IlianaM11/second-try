/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicionombreedad;
import java.util.Scanner;

/**
 *
 * @author nissi
 */
public class JavaejercicioNombreEdad {
//Define una variable que aloje tu nombre 
//y otra que guarde tu edad. 
 //Imprime ambas variables por pantalla//
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner reader = new Scanner(System.in);

        int Edad;
        String Nombre;
        
        System.out.println("Ingrese su Nombre" );
        Nombre = reader.nextLine();
        
         System.out.println("Ingrese su Edad" );
        Edad = reader.nextInt();
        
        System.out.println( "Su nombre es:     "  + Nombre );
        System.out.println( "Su Edad es:     "  + Edad );
        
    }
    
}
