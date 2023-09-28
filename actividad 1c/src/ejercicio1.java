import java.io.PrintStream;
import java.util.Scanner;

/**
 * 1. Dado un numero entero mostrar cual es el residuo de la división por 2.
 */
public class ejercicio1 {

    public static void main(String[] args) {
        PrintStream pantallita = System.out;

        Scanner escaner= new Scanner(System.in);
        int n1=0;
        int n2 =2;
        int res =0;
        pantallita.println("ingrese un numero");
        n1= escaner.nextInt();
        res = n1%n2;
        pantallita.println("el residuo del numero al dividirlo por 2 es:  "+res);
    }
}

