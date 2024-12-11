/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vectores arreglos unidimensionales
        //Inicializar el vectos
        int numeros[] = new int[5];
        
        //Cargar vector manualmente
        /*
        numeros[0]=32;
        numeros[1]=24;
        numeros[2]=12;
        numeros[3]=53;
        numeros[4]=145;
        */
        //Carga mediante teclado
        System.out.println("Ingrese números a guardar");
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<5;i++){
            numeros[i] = teclado.nextInt();
            
        }
        
        //Recorrido de vector
        for(int i=0;i<5;i++){
            System.out.println("El valor guardado en la posición: " + " es " + numeros[i]);
        }
    }
    
}
