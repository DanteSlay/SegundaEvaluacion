package EjerciciosArraysInternet;

import java.util.Scanner;

public class Ejercicio03 {
    /*Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, 
    por último nos indica cual es el mayor de todos.

Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Indica el tamaño del array: ");
        int tamaño = in.nextInt();
        System.out.println("Introduce entre que numeros estara compuesto la lista:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();

        int[] array = new int [tamaño];
        numerosPrimos(array, num1, num2);
        mostrarArray(array);
        mayor(array);
        
    }

    public static void numerosPrimos(int lista[], int a, int b){
        int i = 0;
        while(i<lista.length){
            int numPrimo = (int) (Math.floor(Math.random()*(b-a+1)+a));
            if(numPrimo <=1){

            }else if(numPrimo % 2 == 0){
                lista[i] = numPrimo;
                i++;
            }
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void mayor(int[] lista){
        int mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            if(mayor < lista[i]){
                mayor = lista[i];
            }
        }
        System.out.println("El numero mayor es: " +mayor);
    }
}
