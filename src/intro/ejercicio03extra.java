/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class ejercicio03extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una Letra para saber si es bocal: ");
        letra=leer.next();
        letra=letra.toUpperCase();
        System.out.println(letra);
        if(letra.equals("A")||letra.equals("E")|| letra.equals("I")||letra.equals("O")||letra.equals("U") ){
            System.out.println("Es VOCAL");
        }
        else{            
            System.out.println("NO es Vocal");
            }
                
    }
    
}
