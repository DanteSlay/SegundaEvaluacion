package String;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la
letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = in.nextLine();

        System.out.println("Si cambio la 'a' por la 'b'\n"+
                                cadena.replace("a", "b"));
    }
    
}
