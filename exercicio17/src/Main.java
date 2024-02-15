import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vN1;
        double aN2;
        double tN3;

        System.out.println("Digite a velocidade inicial:");
        vN1 = scanner.nextDouble();
        System.out.println("Digite a aceleração:");
        aN2 = scanner.nextDouble();
        System.out.println("Digite o tempo:");
        tN3 = scanner.nextDouble();

        double n3 = vN1 + (aN2 * tN3);

        System.out.println(n3);

    }
}