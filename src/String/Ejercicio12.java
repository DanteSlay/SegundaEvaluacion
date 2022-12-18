package String;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
cadenas se introducen por teclado. */
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = in.nextLine();

        System.out.println("Introduce una subcadena:");
        String subcadena = in.nextLine();

        if(cadena.contains(subcadena)){
            System.out.println("La cadena contiene la subcadena.");
        }else{
            System.out.println("La cadena no contiene la subcadena.");
        }
    }
}
