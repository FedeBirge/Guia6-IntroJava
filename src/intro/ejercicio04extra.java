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
public class ejercicio04extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
        // y se muestre su equivalente en romano
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre 1 y 10: ");
        num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El equivalente en romano de " + num + " es I");
                break;
            case 2:
                System.out.println("El equivalente en romano de " + num + " es II");
                break;
            case 3:
                System.out.println("El equivalente en romano de " + num + " es III");
                break;
            case 4:
                System.out.println("El equivalente en romano de " + num + " es IV");
                break;
            case 5:
                System.out.println("El equivalente en romano de " + num + " es V");
                break;
            case 6:
                System.out.println("El equivalente en romano de " + num + " es VI");
                break;
            case 7:
                System.out.println("El equivalente en romano de " + num + " es VII");
                break;
            case 8:
                System.out.println("El equivalente en romano de " + num + " es VIII");
                break;
            case 9:
                System.out.println("El equivalente en romano de " + num + " es IX");
                break;
            case 10:
                System.out.println("El equivalente en romano de " + num + " es X");
                break;
            default:System.out.println("Numero ingresa no es correcto");    

        }
    }
}
