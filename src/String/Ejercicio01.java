package String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*Escribir por pantalla cada carácter de una cadena introducida por teclado. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce cadena:");
        String cadena = in.nextLine();
        for (int letra = 0; letra <= cadena.length()-1; letra++) {
            System.out.println(cadena.charAt(letra));
        }
    }
    
}
