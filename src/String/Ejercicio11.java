package String;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
         * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
minúsculas y viceversa.
         */
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();

        String cadenaCambiada = "";
        String cadenaMayuscula = cadena.toUpperCase();
        String cadenaMinuscula = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++){
            Character letra = cadena.charAt(i);
            Character letraMay = cadenaMayuscula.charAt(i);
            if(letra.equals(letraMay)){
                cadenaCambiada += cadenaMinuscula.charAt(i);
            }else{
                cadenaCambiada += cadenaMayuscula.charAt(i);
            }
        }

        System.out.println(cadenaCambiada);
        
    }
}
