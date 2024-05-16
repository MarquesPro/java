import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O valor " + numero + " foi encontrado na posição " + i + " do vetor.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}
