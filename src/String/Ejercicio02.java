package String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*Realizar un programa que comprueba si una cadena leída por teclado comienza por una
subcadena introducida también por teclado. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();

        System.out.println("Introduce una palabra: ");
        String palabra = in.nextLine();

        System.out.println("La primera frase empieza con la segunda: "+cadena.startsWith(palabra));
    }
    
}
