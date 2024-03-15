package lista;

public class Exercicio2 {
    public static void executar() {
        Prompt.imprimir("Informe o primeiro número");
        double num1 = Prompt.lerDecimal();
        Prompt.imprimir("Informe o segundo número");
        double num2 = Prompt.lerDecimal();

        Prompt.imprimir("A soma dos dois números: " + (num1 + num2));
    }
}
