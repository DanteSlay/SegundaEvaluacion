package String;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y,
a continuación dé tres opciones:
• Contar: pide una palabra, y me dice cuantas veces aparece en la lista
• Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones
de la primera por la segunda.
• Eliminar: pide una , y la elimina de la lista.
• Mostrar: muestra la lista de cadenas
• Salir */
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantas palabras vas a añadir? ");
        int numTotal = in.nextInt();

        String cadena = "";
        System.out.println("Introduce las " +numTotal+ " palabras: ");
        for(int i = 0; i < numTotal; i++){
            String palabra = in.next();
            cadena += (palabra + " ");
        }

        
    }
    
}
