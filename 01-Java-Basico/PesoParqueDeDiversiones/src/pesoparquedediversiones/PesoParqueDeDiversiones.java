package pesoparquedediversiones;

import java.util.Scanner;

public class PesoParqueDeDiversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese su peso en Kg: ");
        
        Scanner teclado = new Scanner(System.in);
        double peso = teclado.nextDouble();
        
        if (peso >= 100) {
            System.out.println("El peso excede los límites del juego");
            
            
        }
        else{
            System.out.println("Adelante puede pasar");
            
        }
        
    }
    
}
