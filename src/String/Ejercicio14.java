package String;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*Suponiendo que hemos introducido una cadena por teclado que representa una frase
(palabras separadas por espacios), realiza un programa que cuente cuántas palabras tiene. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();
        cadena += " ";

        int contador = 0;
        for(int i = 0; i <= cadena.length()-1; i++){
            Character letra = cadena.charAt(i);
            if(letra.equals(' ')){
                contador += 1;
            }
        }
        System.out.println("Hay " +contador+ " palabras.");
    }
    
}
