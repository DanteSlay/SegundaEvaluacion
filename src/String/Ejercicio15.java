package String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la
cadena. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();

        System.out.print("Introduce un caracter: ");
        char caracter = in.next().charAt(0);
        
        int contador = 0;
        for(int i = 0; i <= cadena.length()-1; i++){
            Character letra = cadena.charAt(i);
            if(letra.equals(caracter)){
                contador += 1;
            }
        }

        System.out.println("La letra " +caracter+ " aparece " +contador+ " veces.");


    }
}
