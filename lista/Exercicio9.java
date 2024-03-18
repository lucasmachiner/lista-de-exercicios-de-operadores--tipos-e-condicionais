package lista;

public class Exercicio9 {
    public static void executar() {
        Prompt.imprimir("Informe o valor de A");
        double A = Prompt.lerDecimal();
        Prompt.imprimir("Informe o valor de B");
        double B = Prompt.lerDecimal();

        if (A == B) {
            Prompt.imprimir("O valor de A e B são iguais");
        } else {
            Prompt.imprimir("O número são diferentes");
            Prompt.imprimir(A > B ? "E o valor de A é maior que o de B" : "E o valor de B é maior que de A");
        }
    }

}
