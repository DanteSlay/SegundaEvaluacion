package EjerciciosArraysInternet;

import java.util.Scanner;

public class Ejercicio06 {
    /*Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres. 
    Puedes hacer con o sin métodos de String. */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = in.nextLine();

        char caracteres[] = new char [frase.length()];

        for(int i = 0; i < frase.length(); i++){
            caracteres[i] = frase.charAt(i);
            System.out.println(caracteres[i]);
        }
    }
}
