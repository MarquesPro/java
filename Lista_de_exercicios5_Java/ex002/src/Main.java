import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    public static int calcularFatorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("O fatorial é definido apenas para números inteiros não negativos.");
        }
        if (N == 0) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
