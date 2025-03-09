import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor do capital investido: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensais (em %): ");
        double taxaJuros = scanner.nextDouble() / 100; // Convertendo decimal

        //calc juros
        System.out.println("\nEvolução do investimento ao longo de um ano:");
        for (int mes = 1; mes <= 12; mes++) {
            capital += capital * taxaJuros; // Aplicando juros compostos
            System.out.printf("Mês %d: R$ %.2f\n", mes, capital);
        }

        scanner.close();
    }
}

