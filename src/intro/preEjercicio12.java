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
public class preEjercicio12 {

   

    public static void main(String[] args) {
        // EJERCICIO 12
        //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
        //que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
        //segundo, sino informe que no lo son.
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero entero");
        int num1 = leer.nextInt();

        System.out.println("Ingresa otro numero entero : ");
        int num2 = leer.nextInt();
        String retorno = Multiplo(num1, num2);
        System.out.println(retorno);
    }
    
   public static String Multiplo(int num1, int num2) {
        String retorno;
        if (num1 % num2 == 0) {
            retorno = " ES multiplo ";
        } else {
            retorno = " No es multiplo ";
        }

        return retorno;

    }
}
