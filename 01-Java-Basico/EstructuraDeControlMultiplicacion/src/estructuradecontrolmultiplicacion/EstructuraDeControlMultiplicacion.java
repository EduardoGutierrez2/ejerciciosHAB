/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradecontrolmultiplicacion;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class EstructuraDeControlMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int cont = 1;
        int multiplo = 0;
      
        for(int num = teclado.nextInt();multiplo < num*10; cont+=1) {
            multiplo=num*cont;
            System.out.println(multiplo);
            
            
            
            
        }
            
        
        
        
        
    }
    
}
