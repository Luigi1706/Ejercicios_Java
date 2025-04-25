// 1. Crear un programa que acepte un número entero y crea la tabla de multiplicar con los 
// 12 primeros valores de la serie.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for(int i=1; i<=12; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }

        scanner.close();
    }

}