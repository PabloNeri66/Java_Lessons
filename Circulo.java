public class Circulo {

    //Atributos Sempre Privados
    private double raio;
    
    //metodo Construtor
    public Circulo(double r)
    {
        setRaio(r);
    }

    //definir Raio
    private void setRaio(double r)
    {
        if (r<0)
            System.out.println("O raio negativo não existe!");
        else
            raio = r;
    }

    //pegar Raio
    public double getRaio()
    {
        return raio;
    }
}
    