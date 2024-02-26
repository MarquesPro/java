import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta >= 0) {
            // Calcular as raízes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Raízes reais encontradas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Não há raízes reais para a equação informada.");
        }

        scanner.close();
    }
}