import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long plata=0;
        double euro=0;
        double dolar=0;
        System.out.println("ingrese la cantidad de pesos: $");
        plata= scan.nextInt();
        euro = plata/4348.15;
        dolar = plata/4053.50;
        System.out.println("el valor en dolares es: $"+dolar);
        System.out.println("el valor en euro es :$"+euro);
    }
}
