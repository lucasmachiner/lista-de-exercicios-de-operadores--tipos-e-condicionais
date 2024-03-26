package lista;

public class Exercicio20 {
  public static void executar() {
    Prompt.imprimir("Informe o tempo da viagem em horas:");
    double tempViagem = Prompt.lerDecimal();

    Prompt.imprimir("Informe a velocidade média em km/h:");
    double velocidade = Prompt.lerDecimal();

    double distancia = tempViagem * velocidade;

    double calcConsumo = distancia / 12.0;

    Prompt.imprimir("A quantidade de litros de combustível gasta na viagem é: " + calcConsumo);
  }
}
