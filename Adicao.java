import java.util.Scanner;

public class Adicao {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.print("Digite Num 1: ");
        num1 = input.nextInt();

        System.out.print("Digite Num 2: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma é de %d \n", soma);

    }
}
