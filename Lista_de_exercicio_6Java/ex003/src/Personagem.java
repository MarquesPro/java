import java.util.Random;
import java.util.Scanner;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = gerarNumeroAleatorio(20, 30);
        this.defesa = gerarNumeroAleatorio(10, 15);
    }

    public void ataque(Personagem adversario) {
        int dano = this.ataque - adversario.getDefesa();
        if (dano > 0) {
            adversario.receberDano(dano);
            System.out.println(this.nome + " atacou " + adversario.getNome() + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + adversario.getNome() + ", mas o ataque foi defendido.");
        }
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    private int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogador:");
        String nomeJogador = scanner.nextLine();

        Personagem jogador = new Personagem(nomeJogador);
        Personagem computador = new Personagem("Computador");

        while (jogador.getVida() > 0 && computador.getVida() > 0) {
            System.out.println("Vida do " + jogador.getNome() + ": " + jogador.getVida());
            System.out.println("Vida do " + computador.getNome() + ": " + computador.getVida());
            System.out.println("Digite 'atacar' para atacar o adversário:");
            String comando = scanner.nextLine();

            if (comando.equalsIgnoreCase("atacar")) {
                jogador.ataque(computador);
                if (computador.getVida() <= 0) {
                    break;
                }
                computador.ataque(jogador);
            } else {
                System.out.println("Comando inválido. Por favor, digite 'atacar'.");
            }
        }
    }
}
