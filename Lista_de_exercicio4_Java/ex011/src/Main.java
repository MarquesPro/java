import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da primeira matriz:");
        int linhasA = scanner.nextInt();
        System.out.println("Informe o número de colunas da primeira matriz:");
        int colunasA = scanner.nextInt();
        System.out.println("Informe o número de linhas da segunda matriz:");
        int linhasB = scanner.nextInt();
        System.out.println("Informe o número de colunas da segunda matriz:");
        int colunasB = scanner.nextInt();
        if (colunasA != linhasB) {
            System.out.println("Não é possível calcular o produto das matrizes com esses tamanhos.");
            return;
        }
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        System.out.println("Preencha os elementos da primeira matriz:");
        preencherMatriz(scanner, matrizA);
        System.out.println("Preencha os elementos da segunda matriz:");
        preencherMatriz(scanner, matrizB);
        int[][] matrizProduto = multiplicarMatrizes(matrizA, matrizB);
        System.out.println("Matriz Produto:");
        exibirMatriz(matrizProduto);
    }
    public static void preencherMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    public static int[][] multiplicarMatrizes(int[][] A, int[][] B) {
        int linhasA = A.length;
        int colunasA = A[0].length;
        int colunasB = B[0].length;
        int[][] produto = new int[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return produto;
    }
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
