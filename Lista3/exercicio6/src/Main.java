import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.println("Números entre " + numero1 + " e " + numero2 + ":");
            for (int i = numero1 + 1; i < numero2; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, insira um primeiro número menor que o segundo.");
        }

        scanner.close();
    }
}
