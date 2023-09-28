import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Horas=0;
        float PPHoras=0;
        float Retencion=0;
        float SalBruto=0;
        float RetFt=0;
        float SalNeto=0;
        System.out.println("cantidad de horas que trabaja a la semana: ");
        Horas=scan.nextInt();
        System.out.println("Valor por hora: ");
        PPHoras=scan.nextInt();
        System.out.println("ingrese la retencion: ");
        Retencion=scan.nextInt();
        SalBruto= Horas*PPHoras;
        RetFt= SalBruto*(Retencion/100);
        SalNeto= SalBruto-RetFt;
        System.out.println("el salario bruto es : "+SalBruto);
        System.out.println("la retencion en la fuente es: "+RetFt);
        System.out.println("el salario neto es: "+SalNeto);


    }
}
