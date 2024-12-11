/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejswitch;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class EjSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número del 1 al 7 para saber el día de la semana");
        Scanner teclado = new Scanner(System.in);
        
        int dia = teclado.nextInt();
        
        switch(dia){
            case 1: System.out.println("El día es Lunes");
            break;
            
            case 2: System.out.println("El día es Martes");
            break;
            
            case 3: System.out.println("El día es Miercoles");
            break;
            
            case 4: System.out.println("El día es Jueves");
            break;
            
            case 5: System.out.println("El día es Viernes");
            break; 
            
            case 6: System.out.println("El día es Sabado");
            break;
            
            case 7: System.out.println("El día es Domingo");
            break;
            
            default: System.out.println("Ingresó un número no válido");
            break;
            
            
           
        }
    }
    
}
