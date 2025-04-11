public class Retangulo {
    private double base;
    private double altura;

    // Construtor com parâmetros
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Construtor padrão
    public Retangulo() {
        this.base = 2;
        this.altura = 1;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Área
    public double calcularArea() {
        return base * altura;
    }

    // Perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Verifica se é quadrado
    public boolean ehQuadrado() {
        return base == altura;
    }

    // Imprime todas as informações
    public void imprimirInformacoes() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("É quadrado? " + (ehQuadrado() ? "Sim" : "Não"));
    }
}
