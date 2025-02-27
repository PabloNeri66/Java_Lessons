import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.printf("A temperatura em Celsius é: %.1f°C\n", celsius);

        input.close(); //liberar dados de entrada
    }
}
