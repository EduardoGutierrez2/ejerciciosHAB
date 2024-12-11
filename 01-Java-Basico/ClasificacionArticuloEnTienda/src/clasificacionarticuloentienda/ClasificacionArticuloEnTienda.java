/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificacionarticuloentienda;

import java.util.Scanner;

/**
 
 */
public class ClasificacionArticuloEnTienda {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a la tienda");
        System.out.println("Escriba el precio de su artículo: ");
        
        Scanner teclado = new Scanner(System.in);
        double articulo = teclado.nextDouble();
        
        if(articulo <= 50){
            System.out.println("El articulo se cataloga como Económico");
            
        }
        else {
            if(articulo >= 50 && articulo <= 100){
                System.out.println("El articulo se cataloga como Accesible");
                
            
            }
            else {
                if(articulo >= 100 && articulo <= 200){
                    System.out.println("El articulo se cataloga como Estandar");
            
                }
                else{
                    System.out.println("El articulo se cataloga como Premium");
            
                }
            }
        }
     
    }
    
    
}
