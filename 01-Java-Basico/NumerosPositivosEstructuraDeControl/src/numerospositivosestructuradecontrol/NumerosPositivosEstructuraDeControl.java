
package numerospositivosestructuradecontrol;

import java.util.Scanner;


public class NumerosPositivosEstructuraDeControl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = teclado.nextInt();
        int cont = 0;
        while(num >= 0){
            cont+=num;
            System.out.println("Ingresa otro número");
            num = teclado.nextInt();
            if (num <= 0){
                System.out.println("La suma de los números positivos ingresados es: " + cont);
                break;
            }
            
            
                
                
                    }
    }
    
}
