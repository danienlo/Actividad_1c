import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longitud=0;
        int ancho=0;
        int alto=0;
        int vol =0;
        long litros=0;
        System.out.println("ingrese la longitud del acuario en cm");
        longitud = scan.nextInt();
        System.out.println("ingrese el ancho del acuario en cm");
        ancho = scan.nextInt();
        System.out.println("ingrese el alto del acuario en cm");
        alto = scan.nextInt();
        vol =alto*ancho*longitud;
        litros = vol/1000;
        vol = (vol*90)/100;
        System.out.println("la cantidad de litros necesario para llenar el acuario al 90% es: "+litros);
    }
}
