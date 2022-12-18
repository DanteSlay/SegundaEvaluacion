package String;

import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en
blanco. El programa debería imprimir true si son iguales, false en caso contrario. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String primeraCadena = in.nextLine().replace(" ", "");

        System.out.println("Introduce otra cadena: ");
        String segundaCadena = in.nextLine().replace(" ", "");

        boolean cadenasIguales = primeraCadena.equalsIgnoreCase(segundaCadena);

        System.out.println("La primera cadena es igual a la segunda = "+cadenasIguales);
    }
    
}
