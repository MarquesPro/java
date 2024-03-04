public class Main {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 e menores que 200:");
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}