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
public class ejercicio05extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Una obra social tiene tres clases de socios: 
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos. 
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
//los mismos tratamientos que los socios del tipo A. 
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
//tratamientos. 
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
//real que represente el costo del tratamiento (previo al descuento) y determine el 
//importe en efectivo a pagar por dicho socio
    Scanner leer = new Scanner(System.in);
    String socio;    
    int valor;
        System.out.println("Ingrese la categoria del socio, puede ser A, B o C: ");
        socio=leer.next();
        System.out.println("Ingrese el costo del tratamiento: ");
        valor=leer.nextInt();
        socio=socio.toUpperCase();
        switch (socio){
            case "A": System.out.println("Socio de categoria A abona:" +(valor/2));
            break;
            case "B": System.out.println("Socio de categoria B abona:" +(valor*0.65));
            break;
            case "C": System.out.println("Socio de categoria C abona:" +(valor));
            break;
            default:System.out.println("No es una categoria de socio");
                
        }
    }
            
        
    
}
