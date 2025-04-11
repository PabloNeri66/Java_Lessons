public class QuadRetSobreCarregados {

    // Método quadrado (1 parâmetro)
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    // M área de retângulo (2 parâmetros)
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        // Área de um terreno quadrado
        double areaQuadrado = calcularArea(5); // lado = 5
        System.out.println("Área do terreno quadrado: " + areaQuadrado);

        // Área de um terreno retangular
        double areaRetangular = calcularArea(10, 4); // base = 10, altura = 4
        System.out.println("Área do terreno retangular: " + areaRetangular);
    }
}
