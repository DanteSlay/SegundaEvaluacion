package EjerciciosArraysInternet;

import java.util.Scanner;

public class Ejercicio05 {
    /* Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). 
    Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta, se añadira a una cadena que se mostrara al final, 
    se dejará de insertar cuando se introduzca un -1.

Por ejemplo, si escribo los siguientes numeros
0 //Añadira la ‘A’
5 //Añadira la ‘F’
25 //Añadira la ‘Z’
50 //Error, inserte otro numero
-1 //fin

Cadena resultante: AFZ */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arrayLetras = new char [26];
        for(int i = 65, j = 0; j < arrayLetras.length; i++, j++){
            arrayLetras[j] = (char) i;
        }

        String letrasElegidas = "";
        
        while(true){
            System.out.println("Introduce números desde el 0 al 25 (-1 para salir): ");
            int eleccion = in.nextInt();

            if(eleccion == -1){
                break;
            }else if(!(0 <= eleccion && eleccion <= 25)){
                System.out.println("Error, introduzca otro número.");
            }else{
                letrasElegidas += arrayLetras[eleccion];
            }
        }

        System.out.println("Cadena resultante: " +letrasElegidas);
    }
}
