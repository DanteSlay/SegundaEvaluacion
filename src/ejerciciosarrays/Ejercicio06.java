package ejerciciosarrays;

import java.util.ArrayList;

public class Ejercicio06 {
    /*Realizar un programa en el que se inicialice un array de longitud 20 con números
aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
números positivos,la media de los negativos y contar el número de ceros. */
    public static void main(String[] args) {
        /*int tamaño = 20;
        int array[] = new int[tamaño];
        rellenarAleatorios(array, -10, 10);

        int sumaPositivos = 0;
        int contadorPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        int contador0 = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                contadorNegativos += 1;
                sumaNegativos += array[i];
            }else if(array[i] > 0){
                contadorPositivos += 1;
                sumaPositivos += array[i];
            }else{
                contador0 += 1;
            }
        }

        double mediaPositivos = sumaPositivos/contadorPositivos;
        double mediaNegativos = sumaNegativos/contadorNegativos;
        System.out.printf("La media de números positivos es: %.2f", mediaPositivos);
        System.out.printf("\nLa media de números negativos es: %.2f", mediaNegativos);
        System.out.println("\nEn el array hay " +contador0+ " ceros.");
    }
    
    private static void rellenarAleatorios(int lista[], int a, int b) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*(b-a+1)+a));
        }
        */
        //Methodo ArrayList
        /*Realizar un programa en el que se inicialice un array de longitud 20 con números
aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los
números positivos,la media de los negativos y contar el número de ceros. */
        int tamaño = 20;
        ArrayList<Integer> arr = new ArrayList<>();

        double sumaPost = 0;
        double contPost = 0;
        double sumaNegat = 0;
        double contNegat = 0;
        int cont0 = 0;

        for (int i = 0; i < tamaño; i++) {

            int numAleatorio = (int)(Math.random()*(10-(-10)+1)+(-10));

            arr.add(i, numAleatorio);

            if(numAleatorio > 0){

                sumaPost += numAleatorio;
                contPost += 1;

            }else if(numAleatorio == 0){

                cont0 += 1;

            }else{

                sumaNegat += numAleatorio;
                contNegat += 1;
            }
        }

        double mediaNegat = sumaNegat/contNegat;
        double mediaPost = sumaPost/contPost;
        System.out.println(arr);
        System.out.println("Media Negativos: " +mediaNegat);
        System.out.println("Media Post: " +mediaPost);
        System.out.println("0: " +cont0);

    }
}
