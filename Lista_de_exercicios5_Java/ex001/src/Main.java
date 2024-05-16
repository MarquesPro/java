public class Main {
    public static void main(String[] args) {
        int resultado = somarAteN(5);
        System.out.println("A soma de todos os números de 1 até N é: " + resultado);
    }
    public static int somarAteN(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("N deve ser maior que 0.");
        }
        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }
}
