import java.util.Scanner;

public class PerfilNascimentoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data de nascimento no formato DD/MM/AAAA
        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        String data = scanner.nextLine();

        // Separa dia, mês e ano
        String[] partes = data.split("/");
        int diaMes = Integer.parseInt(partes[0] + partes[1]); // Junta dia e mês
        int ano = Integer.parseInt(partes[2]);

        // Soma diaMes com ano
        int somaTotal = diaMes + ano;

        // Separa os dois primeiros e os dois últimos dígitos
        int primeiros = somaTotal / 100;
        int ultimos = somaTotal % 100;

        // Soma essas partes
        int resultadoFinal = primeiros + ultimos;

        // Obtém o resto da divisão por 5
        int indice = resultadoFinal % 5;

        // Lista de perfis
        String[] perfis = {"Tímido", "Sonhador", "Paquerador", "Atraente", "Irresistível"};

        // Exibe o perfil correspondente
        System.out.println("Seu perfil é: " + perfis[indice]);

        scanner.close();
    }
}
