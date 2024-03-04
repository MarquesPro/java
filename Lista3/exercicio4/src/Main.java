public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão de Celsius para Fahrenheit");
        System.out.println("------------------------------------------");
        System.out.printf("%-10s %-15s\n", "Celsius", "Fahrenheit");
        System.out.println("------------------------------------------");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%-10d %-15.2f\n", celsius, fahrenheit);
        }
    }
}

