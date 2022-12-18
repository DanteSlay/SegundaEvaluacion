package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    /*Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
indicarlo con un mensaje. */
    public static void main(String[] args) {
/*      int array[] = new int[10];
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] = j;
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 10: ");
        int num = in.nextInt();

        boolean esta = false;
        int indice = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                indice = i;
                esta = true;
                break;
            }
        }
        if(esta == true){
            System.out.println("El " +num+ " esta en el indice " +indice);
        }else{
            System.out.println("El número no esta.");
        }
 */
        //ArrayList
        /*Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
indicarlo con un mensaje. */
        int tamaño = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            list.add(i+1);
        }
        System.out.println("Introduce un número (entre 1 y 10)");
        Scanner in = new Scanner(System.in);
        int eleccion = 0;
        while(true){
            eleccion = in.nextInt();
            if(!(list.contains(eleccion))){
                System.out.println("Número incorrecto, vuelva a intentarlo.");
            }else{
                break;
            }
        }
        System.out.println("La posicion de " +eleccion+ " es " +list.indexOf(eleccion));
    }
}
