import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double valorInserido = scanner.nextDouble();

        exibirMenu();
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        double precoBebida = obterPrecoBebida(opcao);
        if (precoBebida > 0) {
            if (valorInserido >= precoBebida) {
                String bebida = obterBebida(opcao);
                double troco = valorInserido - precoBebida;

                System.out.println("Bebida selecionada: " + bebida);
                System.out.println("Troco: R$ " + troco);
            } else {
                System.out.println("Valor inserido insuficiente. Por favor, insira um valor suficiente.");
            }
        } else {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida do menu.");
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Café - R$ 2.50");
        System.out.println("2. Chá - R$ 1.80");
        System.out.println("3. Chocolate Quente - R$ 3.00");
    }

    public static double obterPrecoBebida(int opcao) {
        switch (opcao) {
            case 1:
                return 2.50;
            case 2:
                return 1.80;
            case 3:
                return 3.00;
            default:
                return -1;
        }
    }

    public static String obterBebida(int opcao) {
        switch (opcao) {
            case 1:
                return "Café";
            case 2:
                return "Chá";
            case 3:
                return "Chocolate Quente";
            default:
                return "";
        }
    }
}
