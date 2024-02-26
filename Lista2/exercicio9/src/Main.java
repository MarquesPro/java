import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do lado 3: ");
        double lado3 = scanner.nextDouble();

        if (ehTriangulo(lado1, lado2, lado3)) {
            // Classificar o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }

        scanner.close();
    }

    private static boolean ehTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);

    }
}