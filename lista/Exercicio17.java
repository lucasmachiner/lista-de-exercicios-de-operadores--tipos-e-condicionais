package lista;

import java.text.DecimalFormat;

public class Exercicio17 {
  public static void executar() {
    Prompt.imprimir("Informe as 3 notas");

    double[] notas = new double[3];
    double[] peso = new double[3];

    for (int i = 0; i < notas.length; i++) {
      Prompt.imprimir("Informe a nota " + (i + 1));
      notas[i] = Prompt.lerDecimal();
    }
    for (int i = 0; i < notas.length; i++) {
      Prompt.imprimir("Informe a peso " + (i + 1));
      peso[i] = Prompt.lerDecimal();
    }

    Double calc = ((notas[0] * peso[0]) + (notas[1] * peso[1]) + (notas[2] * peso[2])) / (peso[0] + peso[1] + peso[2]);

    DecimalFormat df = new DecimalFormat("0.##");

    Prompt.imprimir("A sua média é: " + df.format(calc));

  }
}
