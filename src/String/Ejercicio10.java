package String;

import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        /*
         * Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
la cadena por el segundo carácter.
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = in.nextLine();

        System.out.println("Introduce dos caracteres:");
        String caracter1 = in.next();
        String caracter2 = in.next();

        System.out.println(cadena.replace(caracter1, caracter2));
    }
}