package String;

import java.util.Scanner;

public class EjemplosConString{
    public static void main(String[] args) {
        String cadena = "Hola"; // String es el único tipo referencia que te puedes saltas la referencia new String()
        String cadena2 = new String("Hola"); // funcionaria igual

        Scanner sc = new Scanner(System.in);

        String palabra = "murcielago";
        //podemos acceder a sus caracteres indicando el indice en la que estan
        System.out.println("Primera letra = "+palabra.charAt(0));// primera letra
        System.out.println("Letra numero 5 = "+palabra.charAt(5));//es la letra que esta en la posicion 5 (para mi la 6)

        // Métodos que podemos utilizar
        // longitud de una cadena se utiliza cadena.length()

        System.out.println(palabra.length());

        String vacia = "";
        System.out.println("esta vacia?: " +vacia.isEmpty());

        //Para poner en mayusculas
        String palabraMayusculas = palabra.toUpperCase();
        System.out.println("Palabra en mayusculas = "+palabraMayusculas);

        //Para poner en minusculas
        String palabraMinusculas = palabra.toLowerCase();
        System.out.println("Palabra en minuscula = "+palabraMinusculas);

        //Para saber si termina con .....
        Boolean terminaCon = palabra.endsWith("lago");
        System.out.println("Termina con lago?= "+terminaCon);

        //Saber si empieza con ....
        Boolean empiezaCon = palabra.startsWith("lago");
        System.out.println("Empieza con lago?= "+empiezaCon);

        //Para saber si una cadena contiene lo que digamos
        Boolean contiene = palabra.contains("ie");
        System.out.println("Saber si contiene ie = "+contiene);

        //Para sacar una parte de la cadena:
        String parteCadena = palabra.substring(6, 10);
        System.out.println("Sacar parte de cadena del 6 a 10 = "+parteCadena);

        //Para remplazar una parte por otra cosa:
        String cadenaCambiada = palabra.replace("e", "i");
        System.out.println("Cambiar e por i = " +cadenaCambiada);

        //Para eliminar los espacios tanto del inicio como del final
        String cadenaConEspacios = "       hola caracola      ";
        String cadenaSinEspacios = cadenaConEspacios.trim();
        System.out.println("Cadena sin espacios al final = " +cadenaConEspacios+ "\n"+
                            cadenaSinEspacios);

        //Para comparar cadenas es cadena.equals(), pero para compararlas ignorando mayusculas:
        String cadenaConMayusculas = "HOLa";
        String cadenaEnMinusculas = "hola";
        Boolean sonIguales = cadenaConMayusculas.equalsIgnoreCase(cadenaEnMinusculas);
        System.out.println("Son iguales = " +sonIguales);

        //Tamaño de una String
        String str = "Hola";
        System.out.println("Tamaño = " + str.length());
        System.out.println("Tamaño en indices = " +(str.length()-1));

        //Eliminar espacios en blanco
        String frase = "El examen es el lunes";
        System.out.println("Eliminando espacios en blanco = " + frase.replace(" ", ""));
        

    }
}