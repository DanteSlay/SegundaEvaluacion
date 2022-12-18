package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    /*Realizar un programa que declare un array y lo vaya llenando de números intoducidos
por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
entra en el array). */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        /* 
        String numIntroducidos = "";
        System.out.println("Introduce números positivos (negativos para salir): ");
        while(true){
            int eleccion = in.nextInt();

            if(eleccion < 0){
                break;
            }else{
                numIntroducidos += (eleccion +",");
            }
        }

        String array[] = numIntroducidos.split(",");
        System.out.println(Arrays.toString(array));
         */

         //Metodo ArrayList
        /*Realizar un programa que declare un array y lo vaya llenando de números intoducidos
        por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
        elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
        entra en el array). */
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("numeros(Neg salir):");
        while(true){
            int num = in.nextInt();
            if(num >= 0){
                list.add(num);
            }else{break;}
        }
        System.out.println(list);
        
    }
}
