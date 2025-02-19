package Ejercicios;

import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la altura del árbol
        System.out.print("Introduce la altura del árbol: ");
        int altura = scanner.nextInt();

        // Imprimir el árbol
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios antes de los asteriscos (para centrar el árbol)
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");  // Espacios en blanco
            }
            
            // Imprimir los asteriscos para el árbol
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");  // Asteriscos
            }

            // Salto de línea después de cada fila
            System.out.println();
        }

        // Imprimir el tronco del árbol
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= altura - 1; j++) {
                System.out.print(" ");  // Espacios para centrar el tronco
            }
            System.out.println("|");  // Tronco del árbol
        }

        // Cerrar el scanner
        scanner.close();
    }
}
