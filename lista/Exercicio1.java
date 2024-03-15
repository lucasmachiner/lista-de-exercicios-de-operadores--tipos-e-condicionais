package lista;

public class Exercicio1 {
   public static void executar() {
      System.out.println("Informe um número");
      int num = Prompt.lerInteiro();

      if (num > 10) {
         System.out.println("Número maior do que 10!");
      } else {
         System.out.println("Número menor ou igual a 10");
      }
   }
}
