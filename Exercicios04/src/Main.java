import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        double n2;
        System.out.println("Digite um numero inteiro:");
        n1 = in.nextInt();
        System.out.println("Digite um numero real:");
        n2 = in.nextDouble();
        System.out.println("Voce digitou: " + n1 + " e " + n2);
    }
}