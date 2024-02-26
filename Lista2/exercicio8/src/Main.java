import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        // Fechar o scanner
        scanner.close();
    }
}