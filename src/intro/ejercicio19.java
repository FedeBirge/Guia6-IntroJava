/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author feder
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
        //matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
        //signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
        //denota por AT y se obtiene cambiando sus filas por columnas (o viceversa
        int[][] matriz = new int[4][4];
        int[][] inv = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int) (Math.random() * 10);
                System.out.print( matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    inv[j][i]= matriz[i][j];
                
            }
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             System.out.print( inv[i][j]+" ");
            }
                System.out.println("");
        }
        boolean anti = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             if(matriz[i][j] - (inv[i][j])!=0){
                 anti=false;
                 break;
                         
            } 
            
        }
     
        }
            System.out.println(anti);
    }
    
}
