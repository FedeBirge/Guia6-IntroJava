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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
//X y el último tiene que ser una O. 
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
//de FDE, que no respete el formato se considera incorrecta. 
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java Substring(), Length(), equals()
     Scanner leer = new Scanner(System.in);
     boolean salir=false;
     String cad;
     int ok=0, inc=0;
      
     
     while (salir==false){
        System.out.print("Ingresa una cadena para dispositivo : ");
        cad = leer.nextLine();
        System.out.println("");
        if (cad.length()<6){
            if (!cad.equals("&&&&&")){
                salir=true;
            }
            else{
                if(cad.substring(0,1).equals("X") ){
                   if((cad.substring(cad.length()-1 ,cad.length() ).equals("O"))){
                      ok++; 
                    }
                   else{
                       inc++;
                   }
                }
                else{
                    inc++;
                    }
                }
        }   
        else{
         inc++;}
        
        }
        System.out.println("Correctas: "+ok);
        System.out.println("Incorrectas: "+inc );
     
}
}