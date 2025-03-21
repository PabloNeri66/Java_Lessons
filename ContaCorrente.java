public class ContaCorrente
{

   private int NumeroConta;
   private String TitularConta;
   private double SaldoConta;
   
   public ContaCorrente()
   {
   }
   
   public ContaCorrente(int numeroConta, String titularConta, double saldoConta)
   {
   
      NumeroConta= numeroConta;
      TitularConta= titularConta;
      SaldoConta= saldoConta;
   }
   
   public void deposito(double amount)
   {
      SaldoConta += amount;
   }
   
   public void saque(double amount)
   {
      if(amount> SaldoConta)
      {
         System.out.println("Sem Saldo!");
      }
      else
      {
         SaldoConta-=amount;
      }
   }
   
   public String exibirDados()
   {
      return "Numero da conta: " + NumeroConta
      + "Titular da conta: " + TitularConta
      +"Saldo da Conta: " + SaldoConta;
   }

}

import java.util.Scanner;

