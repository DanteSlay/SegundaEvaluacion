package ejerciciosarrays;

import java.util.Arrays;

public class Ejercicio18 {
    /*Generar dos arrays de 10 enteros, que estarán ordenados crecientemente. Copiar
(fusionar) ambos en un tercero, de forma que sigan ordenados. */
    public static void main(String[] args) {
        int tamaño = 10;
        int arr[] = new int[tamaño];
        rellenarAleatorios(arr, 1, 10);

        int arr2[] = new int[tamaño];
        rellenarAleatorios(arr2, 1, 10);

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int arr3[] = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0, j = arr.length; i < arr2.length; i++) {
            arr3[j] = arr2[i];
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    private static void rellenarAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }
}
