import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] matriz = receberMatriz(5, 5);
        int maiorSomaColunas = encontrarMaiorSomaColunas(matriz);
        int maiorSomaLinhas = encontrarMaiorSomaLinhas(matriz);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColunas);
        System.out.println("Maior soma entre as linhas: " + maiorSomaLinhas);
    }
    public static int[][] receberMatriz(int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }
    public static int encontrarMaiorSomaColunas(int[][] matriz) {
        int maiorSoma = Integer.MIN_VALUE;
        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSoma) {
                maiorSoma = somaColuna;
            }
        }
        return maiorSoma;
    }
    public static int encontrarMaiorSomaLinhas(int[][] matriz) {
        int maiorSoma = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSoma) {
                maiorSoma = somaLinha;
            }
        }
        return maiorSoma;
    }
}
