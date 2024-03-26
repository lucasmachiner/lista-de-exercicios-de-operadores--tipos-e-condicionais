package lista;

public class Exercicio19 {
  public static void executar() {
    Prompt.imprimir("Informe o raio do cilindro");
    double raio = Prompt.lerDecimal();
    Prompt.imprimir("Informe a altura do cilindro");
    double altura = Prompt.lerDecimal();

    double calc = 3.14 * (raio * raio) * altura;

    Prompt.imprimir("O volume calculado do cilindro: " + calc);
    ;

  }
}
