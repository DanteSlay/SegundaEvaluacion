package String;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina
con “burgo”. El programa debe imprimir true o false. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una ciudad:");
        String ciudad = in.nextLine();

        String termina = "burgo";
        Boolean bolTermina = ciudad.endsWith(termina);

        System.out.println("La ciudad termina con 'burgo': " +bolTermina);
    }
    
}
