package String;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos
y a continuación muestre las iniciales en mayúsculas. */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce nombre y apellido:");
        String nombreApellido = in.nextLine();

        int posicionLetra = 0;
        char espacio = ' ';
        while(true){
            Character letra = nombreApellido.charAt(posicionLetra);
            if(letra.equals(espacio)){
                break;
            }else{
                posicionLetra++;
            }
        }
        System.out.println("La primera letra del nombre es: " +nombreApellido.charAt(0)+"\n"+
                            "Y la primera letra del apellido es: " +nombreApellido.charAt(posicionLetra+1));
    }
    
}
