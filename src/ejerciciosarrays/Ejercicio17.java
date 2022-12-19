package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;




public class Ejercicio17 {
    /*Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar
en otro array los elementos pares del primero, y, a continuación, los elementos impares. */
    public static void main(String[] args) {
        /*int tamaño = 10;
        int arr[] = new int[tamaño];
        rellenarAleatorios(arr, 1, 10);

        String pares = "";
        String impares = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                pares += arr[i] + ",";
            }else{
                impares += arr[i] + ",";
            }
        }

        String arrPar[] = pares.split(",");
        String arrImpar[] = impares.split(",");

        String arr2[] = new String[arrPar.length + arrImpar.length];
        for(int i = 0; i<arrPar.length; i++){
            arr2[i] = arrPar[i];
        }
        for(int a = 0, i = arrPar.length; a<arrImpar.length; a++){
            arr2[i] = arrImpar[a];
            i++;
        }
        
        
        System.out.println("Array1" +Arrays.toString(arr));
        System.out.println("Array Par"+Arrays.toString(arrPar));
        System.out.println("Array Impar"+Arrays.toString(arrImpar));
        System.out.println("Array Final"+Arrays.toString(arr2));

    }

    private static void rellenarAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }
    */
    //ArrayList
    /*Crear un programa que rellene aleatoriamente un array de 10 números enteros. Guardar
en otro array los elementos pares del primero, y, a continuación, los elementos impares. */
    ArrayList <Integer> list = new ArrayList<>();
    int tamaño = 10;

    for (int i = 0; i < tamaño; i++) {
        int numAleat = (int)(Math.random() * (10 - 1 + 1) + 1);
        list.add(i, numAleat);
    }
    System.out.println(list);

    ArrayList <Integer> list2 = new ArrayList<>();
    
    for (int i = 0; i < list.size(); i++) {
        int elemento = list.get(i);
        if((elemento == 0) || (elemento % 2 == 0)){
            list2.add(elemento);
        }
    }
    for (int i = 0; i < list.size(); i++) {
        int elemento = list.get(i);
        if((elemento == 1) || (elemento % 2 != 0)){
            list2.add(elemento);
        }
    }

    System.out.println(list2);
}

}
