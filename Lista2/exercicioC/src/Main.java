import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    calcularCirculo(scanner);
                    break;
                case 2:
                    calcularTrianguloRetangulo(scanner);
                    break;
                case 3:
                    calcularRetangulo(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("Escolha a forma geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    public static void calcularCirculo(Scanner scanner) {
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        exibirResultados("Círculo", area, perimetro);
    }

    public static void calcularTrianguloRetangulo(Scanner scanner) {
        System.out.print("Digite a base do triângulo retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo retângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base + altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        exibirResultados("Triângulo Retângulo", area, perimetro);
    }

    public static void calcularRetangulo(Scanner scanner) {
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double perimetro = 2 * (comprimento + largura);

        exibirResultados("Retângulo", area, perimetro);
    }

    public static void exibirResultados(String forma, double area, double perimetro) {
        System.out.println("\nResultados para " + forma + ":");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro + "\n");
    }
}