import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long segundos=0;
        long min=0;
        long hora=0;
        long dia=0;
        System.out.println("ingrese la cantidad de segundos: ");
        segundos = scan.nextLong();
        dia=(segundos-segundos%86400)/86400;
        segundos=segundos%86400;
        hora=(segundos-segundos%3600)/3600;
        segundos=segundos%3600;
        min=(min-min%60)/60;
        segundos=segundos%60;
        System.out.println("la cantidad de dias es: "+dia);
        System.out.println("la cantidad de horas es: "+hora);
        System.out.println("la cantidad de minutos es: "+min);
        System.out.println("la cantidad de segundos es: "+segundos);

    }
}
