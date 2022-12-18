package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio13 {
    /*Haz un programa que rellene por teclado un array de 5 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente, decreciente, o si
están desordenados. */
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*int tamaño = 5;

    int array[] = new int[tamaño];
    System.out.println("Introduce 5 numeros:");
    for (int i = 0; i < array.length; i++){
        array[i] = in.nextInt();
    }

    int arrayASC[] = Arrays.copyOf(array, array.length);
    Arrays.sort(arrayASC);
    /*for (int i = 0, menor = i; i < arrayASC.length; i++) {
        menor = array[i];
        for (int j = 0; j < array.length;j++) {
            if(menor >= array[j]){
                menor = array[j];
            }
        }
        arrayASC[i] = menor;
    }

    int arrayDESC[] = new int[tamaño];
    for (int i = 0, j = tamaño-1; i < arrayDESC.length; i++, j--) {
        arrayDESC[i] = arrayASC[j];
    }

        if(Arrays.equals(array, arrayASC)){
            System.out.println("El array es ascendente");
        }else if(Arrays.equals(array, arrayDESC)){
            System.out.println("El array es desendente");
        }else{
            System.out.println("El array esta desordenado");
        }
    */
    //ArrayList
    /*Haz un programa que rellene por teclado un array de 5 números enteros. La aplicación
debe indicarnos si los números están ordenados de forma creciente, decreciente, o si
están desordenados. */
        int tamaño = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Introduce números:");
        for (int i = 0; i < tamaño; i++) {
            list.add(in.nextInt());
        }
        ArrayList<Integer> listAsc = (ArrayList) list.clone();
        Collections.sort(listAsc);

        ArrayList<Integer> listDesc = new ArrayList<>();
        for (int i = 0, j = tamaño-1; i < tamaño; i++, j--) {
            listDesc.add(i, listAsc.get(j));
        }
        if(list.equals(listAsc)){
            System.out.println("La lista está creciente");
        }else if(list.equals(listDesc)){
            System.out.println("La lista está decreciente");
        }else{
            System.out.println("La lista está desordenada");
        }
        System.out.println(list);
        System.out.println(listAsc);
        System.out.println(listDesc);

}

    
}
