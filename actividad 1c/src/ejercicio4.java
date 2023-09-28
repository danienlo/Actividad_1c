import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long dinero=0;
        long M1000=0;
        long M500=0;
        long M200=0;
        long M100=0;
        long M50=0;
        long M1=0;
        System.out.println("ingrese la cantidad de dinero: ");
        dinero = scan.nextLong();
        M1=dinero;
        M1000=(M1-M1%1000)/1000;
        M1=M1%1000;
        M500=(M1-M1%500)/500;
        M1=M1%500;
        M200=(M1-M1%200)/200;
        M1=M1%200;
        M100=(M1-M1%100)/100;
        M1=M1%100;
        M50=(M1-M1%50)/50;
        M1=M1%50;
        System.out.println("la cantidad de monedas de 1000 requerida es: "+M1000);
        System.out.println("la cantidad de monedas de 500 requerida es: "+M500);
        System.out.println("la cantidad de monedas de 200 requerida es: "+M200);
        System.out.println("la cantidad de monedas de 100 requerida es: "+M100);
        System.out.println("la cantidad de monedas de 50 requerida es: "+M50);
        System.out.println("la cantidad de monedas de 1 requerida es: "+M1);

    }
}
