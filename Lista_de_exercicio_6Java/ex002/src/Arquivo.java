import java.util.Scanner;

public class Arquivo {
    private String nome;
    private String conteudo;
    private int tamanho;

    public Arquivo(String nome) {
        this.nome = nome;
        this.conteudo = "";
        this.tamanho = 0;
    }

    public void abrir() {
        System.out.println("Arquivo: " + nome);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Tamanho: " + tamanho + " bits");
    }

    public void editar(String texto) {
        conteudo += texto;
        tamanho = conteudo.length() * 8; // Calcula o tamanho em bits
        System.out.println("Arquivo editado.");
    }

    public void renomear(String novoNome) {
        nome = novoNome;
        System.out.println("Arquivo renomeado para: " + nome);
    }

    public void limpar() {
        conteudo = "";
        tamanho = 0;
        System.out.println("Arquivo limpo.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo:");
        String nomeArquivo = scanner.nextLine();

        Arquivo meuArquivo = new Arquivo(nomeArquivo);

        meuArquivo.abrir();
        System.out.println();

        System.out.println("Digite o conteúdo para editar o arquivo:");
        String textoEdicao = scanner.nextLine();
        meuArquivo.editar(textoEdicao);
        System.out.println();

        meuArquivo.abrir();
        System.out.println();

        System.out.println("Digite o novo nome para renomear o arquivo:");
        String novoNomeArquivo = scanner.nextLine();
        meuArquivo.renomear(novoNomeArquivo);
        System.out.println();

        meuArquivo.limpar();
        System.out.println();

        meuArquivo.abrir();
    }
}
