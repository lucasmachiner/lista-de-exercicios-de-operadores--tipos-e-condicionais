package lista;

import java.text.DecimalFormat;

public class Exercicio15 {
  public static void executar() {
    Prompt.imprimir("Digite as coordenadas do ponto P1 (x1):");
    double x1 = Prompt.lerDecimal();
    Prompt.imprimir("Digite as coordenadas do ponto P1 (y1):");
    double y1 = Prompt.lerDecimal();

    System.out.println("Digite as coordenadas do ponto P2 (x2):");
    double x2 = Prompt.lerDecimal();
    System.out.println("Digite as coordenadas do ponto P2 (y2):");
    double y2 = Prompt.lerDecimal();

    double calc = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    DecimalFormat df = new DecimalFormat("#,##0.00");

    Prompt.imprimir("A distância entre os pontos é de: " + df.format(calc));

  }
}
