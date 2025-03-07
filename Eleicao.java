import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] legendas = {0, 1, 10, 20, 30, 40}; // Códigos dos candidatos
        String[] candidatos = {"Branco", "Nulo", "Mônica", "Cebolinha", "Cascão", "Magali"};
        int[] votos = new int[6]; // Array para contar os votos

        System.out.println("Vote digitando a legenda (-1 para encerrar):");

        while (true) {
            System.out.print("Seu voto: ");
            int voto = scanner.nextInt();

            if (voto == -1) break;

            boolean votovalid = false;

            for (int i = 0; i < legendas.length; i++) {
                if (voto == legendas[i]) {
                    votos[i]++;
                    System.out.println("Voto registrado para " + candidatos[i]);
                    votovalid = true;
                    break;
                }
            }
            if (votovalid == false) {
                System.out.println("Esse número não é reconhecido. Tente novamente.");
        }
    }
    
        // Determinar vencedor
        int maxVotos = 0;
        int indiceVencedor = -1;

        for (int i = 2; i < votos.length; i++) { 
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceVencedor = i;
            }
        }

        System.out.println("\nResultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        if (indiceVencedor != -1) {
            System.out.println("\nO vencedor é: " + candidatos[indiceVencedor] + " com " + maxVotos + " votos.");
        } else {
            System.out.println("\nNenhum voto registrado.");
        }

        scanner.close();
    }
}
