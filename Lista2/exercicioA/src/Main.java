import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro (1 a 7): ");
        int numero = scanner.nextInt();

        String diaDaSemana = obterDiaDaSemana(numero);

        if (diaDaSemana != null) {
            System.out.println("O dia da semana correspondente ao número " + numero + " é " + diaDaSemana + ".");
        } else {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 7.");
        }
        scanner.close();
    }
    public static String obterDiaDaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return null;
        }
}