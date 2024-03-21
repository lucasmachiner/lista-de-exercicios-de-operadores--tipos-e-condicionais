package lista;

public class Exercicio13 {
  public static void executar() {
    Prompt.imprimir("Informe o valor de A");
    double A = Prompt.lerDecimal();
    Prompt.imprimir("Informe o valor de B");
    double B = Prompt.lerDecimal();

    Prompt.imprimir("Informe um operador: +, -, *, /");
    String opd = Prompt.lerLinha();

    if ((A != 0.0 || B != 0.0) && !opd.contains("/")) {
      switch (opd) {
        case "+":
          Prompt.imprimir("A soma de A e B: " + (A + B));
          break;
        case "-":
          Prompt.imprimir("A subtração de A e B: " + (A - B));
          break;
        case "*":
          Prompt.imprimir("A multiplicação de A e B: " + (A * B));
          break;
        case "/":
          Prompt.imprimir("A divisão de A e B: " + (A / B));
          break;
        default:
          Prompt.imprimir("Operador inválido");
          break;
      }
    } else {
      Prompt.imprimir("Informe um número diferente de 0 para realizar a divisão");
    }
  }
}
