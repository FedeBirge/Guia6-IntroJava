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
public class preEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 13 y 13
        //Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
        //define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el nombre de sus compañeros:");
            vector[i]=leer.nextLine();
            
        }
        
        
        
    }
    
}
