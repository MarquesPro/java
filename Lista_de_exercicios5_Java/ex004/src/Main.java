import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();
        if (ehPalindromo(texto)) {
            System.out.println("A palavra ou frase é um palíndromo.");
        } else {
            System.out.println("A palavra ou frase não é um palíndromo.");
        }
    }
    public static boolean ehPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fim = texto.length() - 1;
        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
