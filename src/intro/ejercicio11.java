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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que pida dos números enteros positivos por teclado 
        //y muestre por pantalla el siguiente menú:
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("");
        System.out.print("Ingresa otro numero entero:");
        int num2 = leer.nextInt();
        System.out.println("");
        boolean salir = false;
        String seguir;
        while (salir == false) {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n");
            System.out.print("Ingresa una opcion: ");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));

                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.print("Desea salir del programa S/N?");
                    String salgo = leer.next();
                    if (salgo.equals("s") || salgo.equals("S")) {
                        salir = true;
                    } else {
                        break;
                    }

            }

        }

    }
}
