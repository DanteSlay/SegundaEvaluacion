package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio12 {
    /*Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc. */
    public static void main(String[] args) {
        /*int tamaño = 10;
        int arrayA[] = new int [tamaño];
        rellenarNumAleatorios(arrayA, 1, 10);

        int arrayB[] = new int[tamaño];
        rellenarNumAleatorios(arrayB, 1, 10);

        int array3[] = new int[tamaño];
        for (int i = 0, j = 0, k = 0; i < array3.length; i++) {
            if(i == 0){
                array3[i] = arrayA[j];
                j++;
            }else if(i%2==0){
                array3[i] = arrayA[j];
                j++;
            }else{
                array3[i] = arrayB[k];
                k++;
            }
        }

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(array3));
    }

    public static void rellenarNumAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            int numAleatorio = (int) (Math.floor(Math.random()*(b-a+1)+a));
            lista[i] = numAleatorio;
        }
    }
    */
        //ArrayList
        /*Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
mezclarlos en un tercero de la forma: el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc. */
        int tamaño = 10;
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            int numAleat = (int)(Math.random()*(10-1+1)+1);
            listA.add(numAleat);
        }
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            int numAleat = (int)(Math.random()*(10-1+1)+1);
            listB.add(numAleat);
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0, j = 0, k = 0; i < (listA.size()+listB.size()); i++) {
            if((i == 0)||(i % 2 == 0)){
                list3.add(i, listA.get(j));
                j++;
            }else{
                list3.add(i, listB.get(k));
                k++;
            }
        }
        System.out.println(listA);
        System.out.println(listB);
        System.out.println(list3);
    }
}
