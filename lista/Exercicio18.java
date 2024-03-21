package lista;

import java.text.DecimalFormat;

public class Exercicio18 {
  public static void executar() {

    double[] notas = new double[3];
    DecimalFormat df = new DecimalFormat("0.##");

    for (int i = 0; i < notas.length; i++) {
      Prompt.imprimir("Informe a nota " + (i + 1));
      notas[i] = Prompt.lerDecimal();
    }

    double mediaHarmonica = notas.length / ((1 / notas[0]) + (1 / notas[1]) + (1 / notas[2]));
    Prompt.imprimir("A média harmônica das notas é: " + df.format(mediaHarmonica));
  }
}
