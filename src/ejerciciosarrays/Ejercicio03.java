package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
    /*Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida
valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2. */
    public static void main(String[] args) {
        /*int tamaño = 5;

        int a1[] = new int[tamaño];
        int a2[] = new int[tamaño];

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce los números del a1:");
        for (int i = 0; i < a1.length; i++) {
            int num = in.nextInt();
            a1[i] = num;
        }
        System.out.println("Introduce los números del a2:");
        for (int i = 0; i < a1.length; i++) {
            int num = in.nextInt();
            a2[i] = num;
        }

        int a3[] = new int[a1.length];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = a1[i] + a2[i];
        }
        System.out.println("El a3 es:");
        for(int i = 0; i < a3.length; i++){
            System.out.println(a3[i]);
        }
        */

        /*Metodo ArrayList */
        /*Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida
valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2. */
        
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> a1 = new ArrayList<>();
        int tamaño = 5;
        System.out.println("Introduce " +tamaño+ " valores para a1:");
        for (int i = 0; i < tamaño; i++) {
            a1.add(in.nextInt());
        }

        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.println("Introduce " +tamaño+ " valores para a2:");
        for (int i = 0; i < tamaño; i++) {
            a2.add(in.nextInt());
        }

        ArrayList<Integer> a3 = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            a3.add(a1.get(i) + a2.get(i));
        }

        System.out.println("El a3 es: " +a3);

    }
}
