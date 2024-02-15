import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2 = 0.0393701;

        System.out.println("digite o valor do milimetro");
        n1 = scanner.nextDouble();

        double n3 = n1 * n2;

        System.out.println(n3);

    }
}