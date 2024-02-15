import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("digite o valor da primeira nota:");
        n1 = scanner.nextDouble();
        System.out.println("digite o valor da segunda nota:");
        n2 = scanner.nextDouble();

        double n3 = (n1 + 2 * n2) / 3;
        System.out.println(n3);

    }
}