package lista;

public class Exercicio12 {
  public static void executar() {
    Prompt.imprimir("Informe o número do mês");
    int numberMonth = Prompt.lerInteiro();

    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    if (numberMonth >= 1 && numberMonth <= 12) {
      Prompt.imprimir(meses[numberMonth - 1]);
    } else {
      Prompt.imprimir("Mês inválido");
    }
  }

}
