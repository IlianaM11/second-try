
package ejercicioconcatenarfrasesconcaracteresespeciales;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;
/**
 *
 * @author nissi
 */
public class EjercicioConcatenarFrasesconCaracteresEspeciales {
/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        String Frase;
        System.out.println("Escriba una Frase: ");
        Frase = reader.nextLine();
        System.out.println(Frase +".");
        
    Frase = Frase.replace('a','@');
    String nuevafrase1 = Frase.replace('e','#');
    String nuevafrase2 = nuevafrase1.replace('i','$');
    String nuevafrase3 = nuevafrase2.replace('o','%');
    String nuevafrase4 = nuevafrase3.replace('u','*');
    
    System.out.println(nuevafrase4);
    } */
    
 @SuppressWarnings("fallthrough")
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        String Frase;
        System.out.println("Escriba una Frase: ");
        Frase = reader.nextLine();
        System.out.println(Frase.toLowerCase() +".");
        Frase = Frase.replace('a','@');
        String nuevafrase1 = Frase.replace('e','#');
        String nuevafrase2 = nuevafrase1.replace('i','$');
        String nuevafrase3 = nuevafrase2.replace('o','%');
        String nuevafrase4 = nuevafrase3.replace('u','*');
      
     switch(Frase.toLowerCase()){
         case "a":  
              Frase = Frase.replace('a','@');
              
          case "e":  
               nuevafrase1 = Frase.replace('e','#');
              
          case "i":  
               nuevafrase2 = nuevafrase1.replace('i','$');
              
         case "o": 
              nuevafrase3 = nuevafrase2.replace('o','%');
             
         case "u":
              nuevafrase4 = nuevafrase3.replace('u','*');
     }
    System.out.println(nuevafrase4.toLowerCase());
    } 

 }
  
    

