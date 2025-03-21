public class Circulo{
    private double Raio;
    
    public Circulo()
    {
    }
    
    
    public Circulo(double raio){
       Raio = raio;
    }
    
    public void alterarRaio(double amount)
    {
       if(amount>0){
          Raio= amount;
       }
       else
       {
          Raio= 0;
       }
    }
    
    public double CalcDiametro()
    {
       double diametro;
       return diametro= 2*Raio;
    }
    
    public double CalcArea()
    {
       return Math.PI*Math.pow(Raio, 2);
    }
    
    public double CalcCircunf()
    {
       return 2*Math.PI*Raio;
    }
    
    public String exibirDados()
    {
       return "Diametro: " + CalcDiametro() +", Area: " + CalcArea()+", Circinferencia: " + CalcCircunf();
        
    }
    
 }
 
 import java.util.Scanner;
 
 public class Program{
 
    public static void main(String[] args)
    {
       Scanner read= new Scanner(System.in);
       double raio= read.nextDouble();
       Circulo circulo= new Circulo(raio);
       System.out.println(circulo.exibirDados());
    }
 }
 