/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseclase2;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class IfElseClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su edad para saber si mayor: ");
        Scanner keyboard = new Scanner(System.in);
        int edad = keyboard.nextInt();
        
        if (edad >= 18){
            System.out.println("Felicidades eres mayor de edad");
        }
        else {
            System.out.println("No eres mayor de edad");
        }
    }    
}
