public class TesteRetangulo {
    public static void main(String[] args) {
        // Criando um retângulo com valores personalizados
        Retangulo r1 = new Retangulo(5, 5);

        // Criando um retângulo com valores padrão
        Retangulo r2 = new Retangulo();

        System.out.println("Retângulo 1:");
        r1.imprimirInformacoes();

        System.out.println("\nRetângulo 2:");
        r2.imprimirInformacoes();
    }
}
