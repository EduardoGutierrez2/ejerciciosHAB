/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edades [][] = new int [3][2];
        
        edades[0][0] = 15;
        edades[0][1]=23;
        edades[1][0]=35;
        edades[1][1] = 65;
        edades[2][0] = 65;
        edades[2][1] = 65;
        
        //Cargar por teclado
        Scanner teclado = new Scanner(System.in);
        for(int f=0;f<edades.length;f++){
            for(int c=0;c<edades[0].length;c++){
                System.out.println("Ingrese el valor para la fila: "+ f + " columna " + c);
                edades[f][c] = teclado.nextInt();
            }
        }
        System.out.println(edades);        
                
    }
    
}
