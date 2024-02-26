import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        } else {
            System.out.println("Valor inválido!");
        }
        scanner.close();
    }
}