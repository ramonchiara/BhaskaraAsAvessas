import java.util.Scanner;

public class Program {

    // PROGRAMA DO BHASKARA AS AVESSAS
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        System.out.print("x2: ");
        double x2 = Double.parseDouble(console.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(console.nextLine());

        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(s * a);

        System.out.println("A equação que tem raizes " + x1 + " e " + x2 + " é " + a + "x² + " + b + "x + " + c);
    }
}
