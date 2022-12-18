package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio05 {
    /*Hacer un programa que inicialice una lista de números con valores aleatorios (10
valores), y los muestre ordenados de menor a mayor. */
    public static void main(String[] args) {
        
    /*  int tamaño = 10;
        int array[] = new int[tamaño];
        rellenarNumAleatorios(array, 1, 10);

        Arrays.sort(array); //ordenar
        System.out.println(Arrays.toString(array)); //Convierte la array en una string entre [..,..,..]
    }
    public static void rellenarNumAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            int numAleatorio = (int) (Math.floor(Math.random()*(b-a+1)+a));
            lista[i] = numAleatorio;
        }
        */

        /*Metodo ArrayList */
        /*Hacer un programa que inicialice una lista de números con valores aleatorios (10
valores), y los muestre ordenados de menor a mayor. */
        int tamaño = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            int numAleatorio = (int)(Math.random()*(10-1+1)+1);
            arr.add(numAleatorio);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
