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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
        //usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
        //numero y si se encuentra repetido
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
      
        for (int i = 0; i < N; i++) {
            vector[i]= (int) (Math.random() * 10);          
        }
        System.out.print("Ingrese un numero entre 0 y 9 a buscar en el vector ");
        int buscar=leer.nextInt();
        for (int i = 0; i < N; i++) {
            if(buscar==vector[i]){
                System.out.println(buscar+" esta en la posicion: "+i);  
            }
          }
    
        
    }
    
}
