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
public class ejercicio06extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas 
        // que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
        
        Scanner leer = new Scanner(System.in);
        int N,M=0;
        float altura,general=0,gralBajo=0;
        System.out.println("Ingrese la cantidad de personas");
        N=leer.nextInt();
        int aux=N;
        while (aux>0){
            System.out.println("Ingrese la estatura: ");
                altura=leer.nextFloat();
                general+=altura;
                if(altura<1.60){
                    gralBajo+=altura;
                    M+=1;
                }
            aux-=1;    
        }
        System.out.println("El rpomedio de altura general es: "+(general/N));
        System.out.println("El promedio de latura menor a 1.60 m es: "+(gralBajo/M));
        
    }
    
}
