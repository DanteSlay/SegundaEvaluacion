package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    /*Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el
teclado 9 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás. */
    public static void main(String[] args) {
        /*int tamaño = 10;
        int array[] = new int[tamaño];

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 9 números: ");
        for(int i = 0; i<9; i++){
            array[i] = in.nextInt();
        }

        int arr2[] = new int[tamaño];
        System.out.print("Introduce otro número: ");
        int num = in.nextInt();

        System.out.print("Introduce la posicion donde lo quieres guardar (1 - 10): ");
        int posicion = in.nextInt() -1;

        for(int i = 0, j = 0; i<arr2.length; i++){
            if(posicion == i){
                arr2[i] = num;
            }else{
                arr2[i] = array[j];
                j++;
            }
        }
        
        System.out.println(Arrays.toString(arr2));
*/
        //ArrayList
        /*Diseñar una aplicación que declare un array de 10 elementos enteros. Leer mediante el
teclado 9 números. Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás. */
        int tamaño = 10;
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce 9 números:");
        for (int i = 0; i < tamaño-1; i++) {
            int num = in.nextInt();
            list.add(i, num);
        }

        System.out.print("Introduce un número: ");
        int num = in.nextInt();
        
        System.out.print("Introduce una posición (entre 1 y 10): ");
        int pos = in.nextInt() - 1;

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0, j = 0; i < list.size() + 1; i++) {
            if(i == pos){
                list2.add(i, num);
            }else{
                list2.add(i, list.get(j));
                j++;
            }
        }

        System.out.println(list);
        System.out.println(list2);
    }
}
