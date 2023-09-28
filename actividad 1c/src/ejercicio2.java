import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long celular=0;
        int indicador=0;
        long temporal=0;
        System.out.println("ingrese un numero linea de celular: ");
        celular=scan.nextLong();
        temporal = celular/100000000;
        indicador = Math.toIntExact(temporal);//trasforma cualquier variable en entera osea int
        System.out.println("el prefijo es: "+temporal);
    }
}
