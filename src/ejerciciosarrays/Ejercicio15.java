package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio15 {
    /*Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
continuación desplace sus elementos una posición hacia la derecha (el último pasa a ser
el primero). */
    public static void main(String[] args) {
        int tamaño = 10;
        int arr[] = new int[tamaño];
        rellenarAleatorios(arr, 1, 10);

        int arr2[] = new int[tamaño];
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if(i == 0){
                arr2[i] = arr[tamaño-1];
            }else{
                arr2[i] = arr[j];
                j++;
            }
        }
        
        System.out.println("Array1: " +Arrays.toString(arr));
        System.out.println("Array2: " +Arrays.toString(arr2));
    }

    private static void rellenarAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }
}
