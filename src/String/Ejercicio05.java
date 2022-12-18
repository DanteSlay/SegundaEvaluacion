package String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en
cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false. */
        Scanner in = new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        String nombre = in.nextLine().toUpperCase();

        String PRIMERA_LETRA = "J";

        if(nombre.startsWith(PRIMERA_LETRA)){
            System.out.println("El nombre empieza con " +PRIMERA_LETRA);
        }else{
            System.out.println("El nombre empieza con una letra distinta ha " +PRIMERA_LETRA);
        }
    }
    
}
