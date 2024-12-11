/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarray1;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class EjercicioArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[5];
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los números: ");
        for(int i=0;i<5;i++){
            numeros[i]=teclado.nextInt();
            if(numeros[i]==7){
                cont+=1;
                    
            }
        
            
        }
        System.out.println("El número 7 apareció "+ cont + " veces");
        
    }
    
}
