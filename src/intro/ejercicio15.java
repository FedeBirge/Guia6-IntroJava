/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author feder
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
        // muestre por pantalla en orden descendente.
        //tipo[] arregloV = new tipo[Tamaño]
           int[] vector = new int[100];
           for (int i = 0; i < 100; i++) {
               vector[i]=i+1;
           }    
           for (int j = 99; j>=0 ; j--) {
               if (j % 10 == 0){
                   System.out.println("");
               }
                 
               System.out.print(vector[j]+"   ");       
               }
 
        }
        
    }
    
