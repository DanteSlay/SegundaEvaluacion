package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio07 {
    /*Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
la nota más alta que ha sacado y la menor. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*
        int tamaño = 5;
        int array[] = new int [tamaño];

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce la nota " +(i+1));
            array[i] = in.nextInt();
            suma += array[i];
        }
        double media = suma/tamaño;

        Arrays.sort(array);
        int menor = array[0];
        int mayor = array[tamaño-1];
        
        System.out.println(Arrays.toString(array));
        System.out.printf("\nLa media es: %.2f", media);
        System.out.println("\nEl número menor es " +menor);
        System.out.println("\nEl número mayor es " +mayor);
 */
        //Metodo ArrayList
        /*Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
(comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
la nota más alta que ha sacado y la menor. */
        int tamaño = 5;

        ArrayList<Integer> arr = new ArrayList<>();
        double sumNotas = 0;
        for (int i = 0; i < tamaño; i++) {
            
            int numAleat = (int)(Math.random()*(10-0+1)+0);
            sumNotas += numAleat;
            arr.add(i, numAleat);

        }
        System.out.println("Todas notas: " +arr);

        double media = sumNotas/tamaño;
        System.out.printf("Media: %.2f", media);

        Collections.sort(arr);
        System.out.println("\nMayor: " +arr.get(tamaño-1));
        System.out.println("Menor: " +arr.get(0));
        
    }
}
