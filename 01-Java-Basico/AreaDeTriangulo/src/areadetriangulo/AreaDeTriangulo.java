package areadetriangulo;

import java.util.Scanner;


public class AreaDeTriangulo {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        double numbase = keyboard.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        double numaltura = keyboard.nextDouble();
        double area = numbase*numaltura/2;
        System.out.println("El área del triangulo es: " + area);
        
    }
    
}
