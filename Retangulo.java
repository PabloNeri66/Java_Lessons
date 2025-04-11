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

   
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

  
    public double calcularArea() {
        return base * altura;
    }

    
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

  
    public boolean ehQuadrado() {
        return base == altura;
    }

    
    public void imprimirInformacoes() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("É quadrado? " + (ehQuadrado() ? "Sim" : "Não"));
    }
}
