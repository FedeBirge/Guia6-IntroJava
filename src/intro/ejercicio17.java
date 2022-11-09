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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
        // cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
      
        for (int i = 0; i < N; i++) {
            vector[i]= (int) (Math.random() * 100000);              
            System.out.print(vector[i]+" ");
         }
        System.out.println("");
         int cont1=0, cont2=0, cont3=0, cont4=0,cont5=0;
         
        for (int i = 0; i < N; i++) {
            
            if(vector[i]<10){
               cont1+=1; 
                }
            else{
                if(vector[i]<100){
                cont2+=1; 
                }
                else{
                    if(vector[i]<1000){
                    cont3+=1;
                      }
                    else{
                    if(vector[i]<10000){
                    cont4+=1; 
                        }
                    else{
                    if(vector[i]<100000){
                    cont5+=1; 
                        }  
                    }
                }
                }
            }
        }
        System.out.println("Numeros de un digito: "+cont1);
        System.out.println("Numeros de dos digitos: "+cont2 );
        System.out.println("Numero de tres digitos: "+cont3);
        System.out.println("Numero de cuatro digitos: "+cont4);
        System.out.println("Numero de cinco digitos: "+cont5);
    }
           
}