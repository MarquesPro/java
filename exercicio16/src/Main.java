import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Digite o valor do raio:");
        n1 = scanner.nextDouble();
        System.out.println("Digite o valor da altura de um cone:");
        n2 = scanner.nextDouble();

        double n3 =(n1*n1)*n2;
        double n4 = n3/3 * 3.14159;

        System.out.println(n4);

    }
}