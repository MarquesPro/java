import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Digite a altura:");
        n1 = scanner.nextDouble();
        System.out.println("Digite a base:");
        n2 = scanner.nextDouble();

        double n3 = (n1*n2) * 1/2;

        System.out.println(n3);

    }
}