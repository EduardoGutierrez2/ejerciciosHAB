/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionotsasecundariamatriz;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class EjercicioNotsaSecundariaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double[][] notas = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        // Cargar las notas de los alumnos
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + " (3 notas):");
            double suma = 0;
            for (int j = 0; j<notas[0].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                suma += notas[i][j];
            }
            // Calcular el promedio y almacenarlo en la última columna
            notas[i][3] = suma / 3;
        }

        // Mostrar las notas y promedios de cada alumno
        System.out.println("\nNotas y promedios de los alumnos:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Alumno " + (i + 1) + " - Notas: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("| Promedio: " + notas[i][3]);
    }
    
}}
