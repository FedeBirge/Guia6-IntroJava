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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Crea una aplicación que a través de una función nos convierta una cantidad de euros 
        //introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
        //función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
        //una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
        //(void).
        //El cambio de divisas es:
        // * 0.86 libras es un 1 €
        // * 1.28611 $ es un 1 €
        // * 129.852 yenes es un 1 €
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una cantidad de Euros: ");
        int n = leer.nextInt();
    }
    
}
