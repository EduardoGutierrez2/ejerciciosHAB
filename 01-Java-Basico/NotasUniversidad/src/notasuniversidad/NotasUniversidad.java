/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasuniversidad;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class NotasUniversidad {


    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese la nota del alunno: ");
        Scanner teclado = new Scanner(System.in);
        double calificacion = teclado.nextDouble();
        
        if(calificacion < 60) {
            
            System.out.println("El rendimiento del alumno es insuficiente");
        }
        else {
            if(calificacion >= 60 && calificacion <= 80) {
                System.out.println("El rendimiento del alumno es Bueno");
                
            }
            else {
                if(calificacion >=81 && calificacion <= 90){
                    System.out.println("El rendimiento del alumno es Notable");
                }
                else{
                    System.out.println("El rendimiento del alumno es Excelente");

                }
            }
        }
    }
    
}
