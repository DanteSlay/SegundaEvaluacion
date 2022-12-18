package EjerciciosArraysInternet;

import java.util.Scanner;

public class Ejercicio08 {
    /*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 
    y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se introduce un numero correcto), 
    estos deben guardarse en un nuevo array.

Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. */
    
public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Indicar tamaño del array: ");
    int tamaño = in.nextInt();

    int array[] = new int[tamaño];
    rellenarNumAleatorios(array, 1, 300);
    
    int num = 0;
    do {
        System.out.print("Introduce número entre 0 y 9: ");
        num = in.nextInt();
    } while (!(num >= 0 && num < 10));

    int terminadosEn[] = arrayConUltimoDigito(array, num);
    
    System.out.println("En un array de " +tamaño+ " posiciones, los números acabados en " +num+ " son:");
    mostrarArray(terminadosEn);
    }

    public static void rellenarNumAleatorios(int lista[], int a, int b){
        for(int i = 0; i < lista.length; i++){
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
    }

    public static int[] arrayConUltimoDigito(int lista[], int num){
        int array2[] = new int [lista.length];

        int ultimoNum = 0;
        for(int i = 0; i<array2.length; i++){
            ultimoNum = lista[i] - (lista[i]/10*10);

            if(ultimoNum == num){
                array2[i] = lista[i];
            }
        }

        return array2;
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            
            if(lista[i] != 0){
                System.out.println(lista[i]);
            }
        }
    }
}
