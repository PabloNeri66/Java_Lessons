public class Program{

   public static void main(String[] args)
   {
      ContaCorrente conta= new ContaCorrente(100, "Pablito", 534.30);
      
      System.out.println(conta.exibirDados());
   }
}