package EjerciciosArraysInternet;

public class Ejercicio04 {
    /*Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
    Obtén la suma de todos ellos y la media. */
    
    public static void main(String[] args){
        int tamaño = 100;
        int[] array = new int [tamaño];

        int contador = 0;
        for(int i = 0; i<array.length; i++){
            array[i] = i+1;
            contador += array[i];
        }

        double media = contador / tamaño;

        System.out.println("La suma total es: " +contador);
        System.out.printf("La media es: %.2f" ,media);
        
    }
}
