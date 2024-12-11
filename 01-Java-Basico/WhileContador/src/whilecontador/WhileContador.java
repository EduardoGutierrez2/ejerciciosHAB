/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilecontador;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class WhileContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa que cuente de 0 hasta 10
        //int cont= 0;
        
        /*while (cont <=10){
            System.out.println("Estoy en el número: " + cont);
            cont+=1;*/
        
        //Programa que ingresa edades y para cuando encuenta una que tenga 70 o más
        System.out.println("Ingresa tu edad: ");
        Scanner teclado = new Scanner(System.in);
        
        int edad = teclado.nextInt();
        
        while (edad <= 70 ) {
            System.out.println("Ingrese su edad: ");
            edad=teclado.nextInt();

        }
    }
    
}
