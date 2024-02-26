import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a opção desejada (entre 5 e 9): ");

        if (scanner.hasNextInt()) {
            int opcao = scanner.nextInt();

            if (opcao >= 5 && opcao <= 9) {
                System.out.println("Opção escolhida: " + opcao);
            } else {
                System.out.println("Opção inválida. O número deve estar entre 5 e 9.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}