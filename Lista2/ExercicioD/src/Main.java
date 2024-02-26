import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");
        System.out.print("Opção: ");
        int opcaoPagamento = scanner.nextInt();

        double totalPagar = calcularTotalPagar(valorCompra, opcaoPagamento);

        System.out.println("Total a pagar: R$ " + totalPagar);

        scanner.close();
    }
    public static double calcularTotalPagar(double valorCompra, int opcaoPagamento) {
        switch (opcaoPagamento) {
            case 1:
                return aplicarDesconto(valorCompra, 0.05);
            case 2:
                return calcularJurosCredito(valorCompra);
            case 3:
                return aplicarDesconto(valorCompra, 0.10);
            default:
                System.out.println("Opção de pagamento inválida. Utilizando valor original.");
                return valorCompra;
        }
    }

    public static double aplicarDesconto(double valor, double desconto) {
        return valor - (valor * desconto);
    }

    public static double calcularJurosCredito(double valor) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de parcelas (1 a 12): ");
        int numParcelas = scanner.nextInt();

        double juros;

        if (numParcelas <= 4) {
            juros = 0.02;
        } else {
            juros = 0.05;
        }

        double valorComJuros = valor + (valor * juros * numParcelas);

        System.out.println("Juros aplicado: " + (juros * 100) + "%");
        System.out.println("Total com juros: R$ " + valorComJuros);

        return valorComJuros;
    }
}