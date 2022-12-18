package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {
    /*Realizar un programa que pida un tamaño de array por teclado y a continuación cree un
array formado por elementos aleatorios pares entre 1 y 50. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*      System.out.print("Introduce el tamño del array: ");
        int tamaño = in.nextInt();

        int array[] = new int[tamaño];
        rellenarNumAleatorios(array, 1, 50);

        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
    }

    public static void rellenarNumAleatorios(int lista[], int a, int b) {
        int i=0;
        do {
            int numAleatorio = (int) (Math.floor(Math.random()*(b-a+1)+a));
            if((numAleatorio%2 == 0) && (numAleatorio != 0)){
                lista[i] = numAleatorio;
                i++;
            }
        }while(i!=lista.length);
         */
        //Metodo ArrayList
        /*Realizar un programa que pida un tamaño de array por teclado y a continuación cree un
        array formado por elementos aleatorios pares entre 1 y 50. */
        System.out.print("Tamaño: ");
        int tamaño = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while (i < tamaño) {

            int numAleat = (int)(Math.random()*(50-1+1)+1);
            if(numAleat % 2 == 0){
                arr.add(numAleat);
                i++;
            }  
        }
        System.out.println(arr);

    }
}
