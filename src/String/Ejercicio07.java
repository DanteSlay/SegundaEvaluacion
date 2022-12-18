package String;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*Escribe un programa que lea una cadena y dos números enteros para indicar los límites
inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de
la cadena. Imprime la subcadena indicada por el rango:
a) suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la
longitud de la cadena;
b) Validando que sucede a). */
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = in.nextLine();

        int inicio = 0;
        while(true){
            System.out.println("Introduce un número entre 0 y " +(cadena.length()-2) + ": ");
            inicio = in.nextInt();
            if(0 > inicio || inicio > (cadena.length()-2)){
                System.out.println("Número invalido, vuelva a intentarlo.");
            }else{break;}
        }
        int indiceFinal = 0;
        while(true){
            System.out.println("Introduce otro número entre " +(inicio+1)+ " y " +(cadena.length()) + ": ");
            indiceFinal = in.nextInt();
            if(inicio >= indiceFinal || indiceFinal > (cadena.length())){
                System.out.println("Número invalido, vuelva a intentarlo.");
            }else{break;}
        }
        
        

        System.out.println(cadena.substring(inicio, indiceFinal));

    }
    
}
