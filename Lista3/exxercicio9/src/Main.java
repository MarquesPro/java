import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int respostaCorreta;
        int acertos = 0;

        System.out.println("Bem-vindo ao Jogo da Tabuada!");
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int multiplicando = random.nextInt(11); // Números aleatórios para tornar o jogo mais dinâmico
            System.out.print("Quanto é " + multiplicando + " x " + multiplicador + "? ");
            respostaCorreta = multiplicando * multiplicador;
            int respostaUsuario = scanner.nextInt();

            if (respostaUsuario == respostaCorreta) {
                System.out.println("Resposta correta!\n");
                acertos++;
            } else {
                System.out.println("Resposta incorreta. O jogo acabou!");
                jogarNovamente(scanner);
                return;
            }
        }
        System.out.println("Parabéns! Você completou a tabuada sem erros!");
        jogarNovamente(scanner);
    }
    private static void jogarNovamente(Scanner scanner) {
        System.out.print("Deseja jogar novamente? (s/n): ");
        char opcao = scanner.next().charAt(0);

        if (opcao == 's' || opcao == 'S') {
            main(null);
        } else {
            System.out.println("Obrigado por jogar. Até a próxima!");
            scanner.close();
        }
    }
}
