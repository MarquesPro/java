import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Informe o titular da conta:");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(numero, saldoInicial, titular);

        System.out.println("Conta criada com sucesso para " + titular + ".");
        System.out.println("Saldo inicial: R$ " + saldoInicial);

        System.out.println("Digite o valor para depósito:");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Saldo atual: R$ " + conta.verificarSaldo());

        System.out.println("Digite o valor para saque:");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Saldo atual: R$ " + conta.verificarSaldo());
    }
}
