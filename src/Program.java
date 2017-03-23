
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ENTRADA
        System.out.print("x1: ");
        double x1 = console.nextDouble();
        System.out.print("x2: ");
        double x2 = console.nextDouble();
        System.out.print("c: ");
        double c = console.nextDouble();

        // PROCESSAMENTO
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(s * a);

        // SAÍDA
        System.out.println("A equação que tem raizes " + x1 + " e " + x2 + " é " + a + "x² + " + b + "x + " + c);
    }
}
