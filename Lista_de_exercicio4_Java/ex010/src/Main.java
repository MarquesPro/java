public class Main {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] matrizB = {
                {7, 8},
                {9, 10}
        };
        int[][] matrizProduto = multiplicarMatrizes(matrizA, matrizB);
        System.out.println("Matriz Produto:");
        exibirMatriz(matrizProduto);
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
