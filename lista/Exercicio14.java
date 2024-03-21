package lista;

public class Exercicio14 {
  public static void executar() {
    Prompt.imprimir(
        "A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética.");
    Prompt.separador();
    Prompt.imprimir("Informe o valor de a1");
    double a1 = Prompt.lerDecimal();
    Prompt.imprimir("Informe o valor de n");
    double n = Prompt.lerDecimal();
    Prompt.imprimir("Informe o valor de r");
    double r = Prompt.lerDecimal();

    double calc = a1 + (n - 1) * r;

    Prompt.imprimir("O valor de an é : " + calc);

  }
}
