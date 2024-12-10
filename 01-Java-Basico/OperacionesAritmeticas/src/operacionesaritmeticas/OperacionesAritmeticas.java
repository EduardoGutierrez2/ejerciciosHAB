package operacionesaritmeticas;

import java.util.Scanner;


public class OperacionesAritmeticas {

   
    public static void main(String[] args) {
        System.out.println("Operador de suma, resta, multiplicación y división ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = keyboard.nextInt();
        System.out.println("Ingrese otro número: ");
        
        int num2 = keyboard.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division);
        
        
    }
    
}
