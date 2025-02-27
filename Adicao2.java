import java.util.Scanner;
public class Adicao2 {
// Adicao.java
// Programa de adição que exibe a soma de dois números. import java.util.Scanner;

    public static void main(String args[])
        {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        double soma;

        System.out.print ("Digite o primeiro número: "); 
        num1= input.nextDouble(); //Lê o primeiro número
        System.out.print ("Digite o segundo número: "); 
        num2= input.nextDouble(); //Lê o segundo número soma num1 + num2;
        soma = num1 + num2 ;
        System.out.printf("A soma é %f\n", soma );
}
}