/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author luisedu
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nombre, apellido1, apellido2;
        
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese el primer apellido: ");
        apellido1 = teclado.next();
        System.out.print("Ingrese el segundo apellido: ");
        apellido2 = teclado.next();
        
        
        StringTokenizer name = new StringTokenizer(nombre);
        while(name.hasMoreTokens()) { 
        System.out.println(name.nextToken().charAt(0)); 
        }
        
        StringTokenizer last1 = new StringTokenizer(apellido1);
        while(last1.hasMoreTokens()) { 
        System.out.println(last1.nextToken().charAt(0)); 
        }
        
        StringTokenizer last2 = new StringTokenizer(apellido2);
        while(last2.hasMoreTokens()) { 
        System.out.println(last2.nextToken().charAt(0)); 
        }
    }
    
}
