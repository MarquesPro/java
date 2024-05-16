import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        if (ehPalindromo(texto)) {
            System.out.println("A palavra ou frase é um palíndromo.");
        } else {
            System.out.println("A palavra ou frase não é um palíndromo.");
        }
    }
    public static boolean ehPalindromo(String texto) {
        if (texto.length() <= 1) {
            return true;
        }
        if (texto.charAt(0) == texto.charAt(texto.length() - 1)) {
            return ehPalindromo(texto.substring(1, texto.length() - 1));
        } else {
            return false;
        }
    }
}
