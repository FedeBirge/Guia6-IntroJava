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
public class ejercicio07extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        . Realice un programa que calcule y visualice el valor máximo, 
//        el valor mínimo y el promedio de n números (n>0). 
//         El valor de n se solicitará al principio del programa y los números 
//      serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
//      bucle “while” y otra con el bucle “do - while”.
        Scanner leer = new Scanner(System.in);
        int n, num, max = 0, min = 0;
        float promedio = 0;
        System.out.println("Ingrese la cantidad de numeros que desea ingresar:");
        n = leer.nextInt();
        int aux=n;
        while (aux > 0) {
            System.out.println("Ingrese un numero entero:");
            num = leer.nextInt();
            promedio += num;
            if (num > max) {
                max = num;
            }
            if (min == 0) {
                min = num;
            } else if (num < min) {
                min = num;
            }
            aux-=1;

        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
        System.out.println("el promedio es: "+(promedio/n));

    }

}
