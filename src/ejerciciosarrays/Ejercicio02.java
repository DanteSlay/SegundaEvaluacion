package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio02 {
    /*Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
muestre en el orden inverso al introducido. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamaño = 5;
        System.out.println("Introduce " +tamaño+ " números decimales: ");
        double array[] = new double[tamaño];
        for (int i = 0; i < array.length; i++) {
            double num = in.nextDouble();
            array[i] = num;
        }

        System.out.println("Su array invertido es:");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    
}
