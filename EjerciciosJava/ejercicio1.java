package Ejercicios;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de filas
        System.out.print("Introduce el número de filas para el triángulo ascendente: ");
        int filas = scanner.nextInt();

        // Bucle para las filas
        for (int i = 1; i <= filas; i++) {
            // Bucle para imprimir los números en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  // Imprime el número seguido de un espacio
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        // Cerrar el scanner
        scanner.close();
    }
}

