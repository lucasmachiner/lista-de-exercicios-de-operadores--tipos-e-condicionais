package lista;

public class Exercicio5 {
    public static void executar() {
        Prompt.imprimir("Informe o valor de A");
        int B = Prompt.lerInteiro();
        Prompt.imprimir("Informe o valor de B");
        int A = Prompt.lerInteiro();

        Prompt.imprimir("Os valores foram invertidos!");
        Prompt.imprimir("Valor de A: " + A);
        Prompt.imprimir("Valor de B: " + B);
    }
}
