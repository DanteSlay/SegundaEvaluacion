package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
    /*Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
10. Mostrar la suma de todos los números que se guardan en el array. */
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = in.nextInt();

        int array[] = new int[tamaño];
        rellenarNumAleatorios(array, 1, 10);

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println("La suma de todos los números es: " +suma);
    }

    public static void rellenarNumAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            int numAleatorio = (int) (Math.floor(Math.random()*(b-a+1)+a));
            lista[i] = numAleatorio;
        }*/

        /*Metodo ArrayList */
        /*Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
10. Mostrar la suma de todos los números que se guardan en el array. */
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el tamaño: ");
        int tamaño = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            arr.add((int)(Math.random()*(10-1+1)+1));
            suma += arr.get(i);
        }
        System.out.println(arr);
        System.out.println(suma);
    }
}
