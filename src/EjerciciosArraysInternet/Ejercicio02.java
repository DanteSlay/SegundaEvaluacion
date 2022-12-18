package EjerciciosArraysInternet;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args){
        /*
         * Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con 
         * números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores. 
         * Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), 
         * para mostrar el contenido 
         * y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios). 
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Indica el tamaño del array: ");
        int tamañoArray = in.nextInt();
        in.close();
        int[] array = new int [tamañoArray];

        generarNum(array, 0, 9);

        mostrarArray(array);

        contador(array);

    }
    public static void generarNum(int lista[], int a, int b) {
        for(int i = 0; i < lista.length; i++){
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void contador(int lista[]) {
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            contador += lista[i];
        }
        System.out.println("La suma es " +contador);
    }
    
}
