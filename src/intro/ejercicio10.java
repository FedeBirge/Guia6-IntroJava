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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // . Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor limite: ");
        int limite = leer.nextInt();
        int suma=0;
        do{
            System.out.println("ingrese un numero a sumar");
            int num = leer.nextInt();
            suma +=num;
            
        } while (suma <= limite);
        System.out.println("la sumatoria es"+ suma);

    
    }
    
}
