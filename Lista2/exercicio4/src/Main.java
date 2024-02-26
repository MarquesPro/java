import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1 (n1): ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota 2 (n2): ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);

        if (media >= 50) {
            System.out.println("Aprovado");
        } else {

            System.out.print("Digite a nota da prova de recuperação: ");
            double provaRecuperacao = scanner.nextDouble();

            double novaMedia = (media + provaRecuperacao) / 2;

            if (novaMedia < 5) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}