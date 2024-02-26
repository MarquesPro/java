import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Insira o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Insira o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;


        if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Duas soluções reais distintas: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("Uma solução real única (raiz dupla): x = " + x);
        } else {

            System.out.println("Não existem soluções reais (soluções complexas conjugadas).");
        }

    }
}