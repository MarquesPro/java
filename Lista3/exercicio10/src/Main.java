import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return calcularFibonacci(num - 1) + calcularFibonacci(num - 2);
        }
    }
}
