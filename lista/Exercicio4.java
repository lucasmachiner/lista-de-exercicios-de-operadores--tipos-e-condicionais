package lista;

public class Exercicio4 {
    public static void executar() {
        Prompt.imprimir("Informe o primeiro número");
        double num1 = Prompt.lerDecimal();
        Prompt.imprimir("Informe o segundo número");
        double num2 = Prompt.lerDecimal();

        Prompt.imprimir("Soma: " + (num1 + num2));
        Prompt.imprimir("Subtração: " + (num1 - num2));
        Prompt.imprimir("Multiplicação: " + (num1 * num2));
        Prompt.imprimir("Divisão: " + (num1 / num2));
    }
}
