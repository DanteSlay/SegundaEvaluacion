package String;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma
es aquella que se lee igual adelante que atrás. */
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();

        String cadenaSinEspacios = cadena.replace(" ", "");

        String cadenaInvertida = "";
        for(int i = cadena.length()-1; i >= 0; i--){
            cadenaInvertida += cadena.charAt(i);
        }

        if(cadenaInvertida.equals(cadenaSinEspacios)){
            System.out.println("La cadena es un palindromo.");
        }else{
            System.out.println("La cadena no es palindromo.");
        }
    }
}
