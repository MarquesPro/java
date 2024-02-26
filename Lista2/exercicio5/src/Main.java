import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
        String conceito;
        if (media >= 8.5) {
            conceito = "A";
        } else if (media >= 7 && media < 8.5) {
            conceito = "B";
        } else if (media >= 5 && media < 7) {
            conceito = "C";
        } else {
            conceito = "D";
        }
        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}