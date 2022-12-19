package ejerciciosarrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio16 {
    /*Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
continuación pedir por teclado una posición (entre 0 y 9). Eliminar el elemento situado
en la posición dada sin dejar huecos. */

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int tamaño = 10;
        int arr[] = new int[tamaño];
        rellenarAleatorios(arr, 1, 10);

        System.out.println("Introduce una posicion (entre 0 y 9)");
        int posicion = in.nextInt();

        int arr2[] = new int[tamaño-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(i == posicion){
            }else{
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("EL array sin la posicion " +posicion+ " es: " +Arrays.toString(arr2));
    }
    
    private static void rellenarAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }
    */
    //ArrayList
    /*Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
continuación pedir por teclado una posición (entre 0 y 9). Eliminar el elemento situado
en la posición dada sin dejar huecos. */

    ArrayList <Integer> list = new ArrayList<>();
    int tamaño = 10;

    for (int i = 0; i < tamaño; i++) {
        int numAleat = (int)(Math.random() * (10 - 1 + 1) + 1);
        list.add(i, numAleat);
    }
    System.out.println(list);

    Scanner in = new Scanner(System.in);

    System.out.print("Eliminar (entre 0 y 9): ");
    int eliminar = in.nextInt();

    for (int i = 0; i < tamaño; i++) {
        if(i == eliminar){
            list.remove(i);
        }else{
        }
    }
    System.out.println(list);


}
}
