// 2. Classe específica Aluno que herda de Pessoa
public class Aluno extends Pessoa {
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da superclasse Pessoa
        this.curso = curso;
    }

    // Sobrescreve o método apresentar
    @Override
    public void apresentar() {
        super.apresentar(); // Chama o método da superclasse
        System.out.println("Curso: " + curso);
    }
}
// 3. Classe principal para instanciar o objeto
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 20, "Engenharia de Software");
        aluno1.apresentar();
    }
}
