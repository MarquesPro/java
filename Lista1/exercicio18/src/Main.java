import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;


        System.out.println("digite um numero:");
        n1 = scanner.nextInt();
        System.out.println("digite o segundo numero:");
        n2 = scanner.nextInt();

        if (n1 == 0) {
            System.out.println("A equação não é do primeiro grau (a não pode ser zero).");
        } else {
            double solucao = -n2 / n1;
            System.out.println("A solução para a equação " +  n1 + "x + " + n2 + " = 0 é x = " + solucao);
        }
    }
}