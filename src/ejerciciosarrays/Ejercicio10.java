package ejerciciosarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    /*Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
simplificarlo vamos a suponer que febrero tiene 28 días. */
public static void main(String[] args) {
    /*
    String mesLetra[] = {"enero", "febrero", "marzo", "abril","mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    int mes31[] = new int[31];
    for (int i = 0, j = 0; j < mes31.length; i++, j++) {
        mes31[i] = j+1;
    }
    int febrero[] = new int[28];
    for (int i = 0, j = 0; j < febrero.length; i++, j++) {
        febrero[i] = j+1;
    }
    
    int mes30[] = Arrays.copyOf(mes31, mes31.length -1);

    Scanner in = new Scanner(System.in);
    int mes = 0;
    while(true){
        System.out.print("Introduce el número de un mes: ");
        mes = in.nextInt();
        if(!(mes >= 1)&&(mes <= 12)){
            System.out.println("Número incorrecto, vuelve a intentarlo.");
        }else{
            break;
        }
    }
    in.close();
    if((mes == 1) || (mes % 3 == 0)){
        System.out.println("\nEL mes es " +mesLetra[mes-1]);
        System.out.print("\nTiene los días: ");System.out.println(Arrays.toString(mes31));
    }else if(mes == 2){
        System.out.println("\nEL mes es " +mesLetra[mes-1]);
        System.out.print("\nTiene los días: ");System.out.println(Arrays.toString(febrero));
    }else{
        System.out.println("\nEL mes es " +mesLetra[mes-1]);
        System.out.print("\nTiene los días: ");System.out.println(Arrays.toString(mes30));
    }
 */
    //ArrayList
    /*Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
simplificarlo vamos a suponer que febrero tiene 28 días. */
    String mesLetra[] = {"enero", "febrero", "marzo", "abril","mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    ArrayList<Integer> mes31 = new ArrayList<>();
    for (int i = 0; i < 31; i++) {
        mes31.add(i+1);
    }
    ArrayList<Integer> febrero = new ArrayList<>();
    for (int i = 0; i < 28; i++) {
        febrero.add(i+1);
    }
    ArrayList mes30 = (ArrayList) mes31.clone();
    mes30.remove(mes30.size() -1);
    
    Scanner in = new Scanner(System.in);
    System.out.print("Mes: ");
    int mes = in.nextInt();

    System.out.println(mesLetra[mes-1]);
    
    if((mes == 1) || (mes % 3 == 0)){
        System.out.println(mes31.get(mes31.size()-1));
    }else if (mes == 2){
        System.out.println(febrero.get(febrero.size()-1));
    }else{
        System.out.println(mes30.get(mes30.size()-1));
    }

}
    
}
