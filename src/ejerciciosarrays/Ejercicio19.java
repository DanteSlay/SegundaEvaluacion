package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {
    /*Vamos a crear un programa que cree un array de números enteros (tamaño introducido
por teclado), muestre el siguiente menú y realice lo que en las opciones se indica:
1. Añadir número al final: pide un número y lo añade al final del array.
2. Añadir número en una posición: pide un número y una posición, y si la posición
existe en el array lo añade en esa posición (la posición se pide a partir de 1).
3. Longitud del array: muestra el tamaño del array.
4. Eliminar el último número: muestra el último número del array y lo borra.
5. Eliminar un número: pide una posición, y si la posición existe en el array borra el
elemento que contiene (lo reemplaza con un 0).
6. Contar números: pide un número y te dice cuántas veces aparece en el array.
7. Posiciones de un número: pide un número y te dice en que posiciones está.
8. Mostrar números: Muestra los números que contiene.
9. Salir */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        ArrayList<Integer> arr = new ArrayList<>(in.nextInt());

        while(true){
            System.out.println("Elige una opcion:"+
            "\n1. Añadir número al final."+
            "\n2. Añadir número en una posición."+
            "\n3. Longitud del array."+
            "\n4. Eliminar el último número."+
            "\n5. Eliminar un número"+
            "\n6. Contar números"+
            "\n7. Posiciones de un número"+
            "\n8. Mostrar números"+
            "\n9. Salir");
            int eleccion = in.nextInt();
            if(eleccion == 9){
                System.out.println("Hasta luego");
                break;
            }else if(!((eleccion >= 1)&&(eleccion <= 8))){
                System.out.println("Número incorrecto, vuelva a intentarlo.");
            }else{
                switch (eleccion) {
                    case 1:
                        System.out.print("Introduce un número:");
                        arr.add(in.nextInt());
                        break;
                    case 2:
                        System.out.print("Introduce un número:");
                        int num = in.nextInt();
                        System.out.print("Introduce una posicion:");
                        int posicion = in.nex
                        break;
                
                    default:
                        break;
                }
            }
        }
    }
}
