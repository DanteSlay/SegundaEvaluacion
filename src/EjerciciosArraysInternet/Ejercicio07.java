package EjerciciosArraysInternet;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Ejercicio07 {
    /*Crea dos arrays de números con una posición pasado por teclado.

Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior, 
después crea un nuevo array con el primer array (usa de nuevo new con el primer array) con el mismo tamaño que se ha pasado por teclado,
rellenalo de nuevo con números aleatorios.

Después, crea un método que tenga como parámetros, 
los dos arrays y devuelva uno nuevo con la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente. 
Por último, muestra el contenido de cada array.

Llama al final al recolector de basura. */
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Introduce el tamaño del array: ");
    int tamaño = in.nextInt();

    int array1[] = new int[tamaño];
    rellenarConNumAletarorios(array1, 10, 100);

    int array2[];

    array2 = array1;

    int array3[] = multiplicador(array1, array2);

    System.out.println("Array1");
    mostrarArray(array1);

    System.out.println("Array2");
    mostrarArray(array2);

    System.out.println("Array3");
    mostrarArray(array3);
    }

    public static void rellenarConNumAletarorios(int lista[], int a, int b) {
        for(int i = 0; i < lista.length; i++){
            lista[i] = ((int) Math.floor(Math.random()*(b-a+1)+a));
        }
    }

    public static int[] multiplicador(int lista1[], int lista2[]) {
        int array3[] = new int[lista1.length];

        for(int i = 0; i < lista1.length; i++){
            array3[i] = lista1[i] * lista2[i];
        }
        return array3;
    }

    public static void mostrarArray(int lista[]) {
        for(int i = 0; i < lista.length; i++){
            System.out.println("En el indice " +i+ " está el número " +lista[i]);
        }
    }
}
