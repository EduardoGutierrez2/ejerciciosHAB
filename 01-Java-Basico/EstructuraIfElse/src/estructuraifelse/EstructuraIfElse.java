/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraifelse;

import java.util.Scanner;


public class EstructuraIfElse {


    public static void main(String[] args) {
        System.out.println("La estatura mínima para entrar a la montaña rusa es de 1.60");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa tu estatura en metros: ");
        double estatura = keyboard.nextDouble();
        
        if(estatura >= 1.6) {
            if (estatura <= 1.98) {
                System.out.println("Puedes pasar a la montaña rusa");
            }
            else {
            System.out.println("No puedes pasar a la montaña rusa");
            }        
        
        
            
            
        }

        
    }
    
}
