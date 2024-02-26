import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2 = 3.6;

        System.out.println("Digite a velocidade do carro em KM:");
        n1 = scanner.nextDouble();

        double n3 = n1/n2;

        System.out.println(n3);

    }
}