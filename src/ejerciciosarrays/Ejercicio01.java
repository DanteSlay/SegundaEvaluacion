package ejerciciosarrays;

import java.util.Scanner;

public class Ejercicio01 {
    /*Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
muestre en el mismo orden introducido. */
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int tamaño = 5;
    System.out.println("Introduce 5 numeros decimales:");
    double array[] = new double[tamaño];
    for (int i = 0; i < array.length; i++) {
        double num = in.nextDouble();
        array[i] = num;
    }

    System.out.println("Tu array es:");
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
    
}
