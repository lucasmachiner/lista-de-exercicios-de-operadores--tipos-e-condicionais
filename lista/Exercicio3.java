package lista;

public class Exercicio3 {
    public static void executar() {
        Prompt.imprimir("Informe o primeiro número");
        int num1 = Prompt.lerInteiro();
        Prompt.imprimir("Informe o segundo número");
        int num2 = Prompt.lerInteiro();

        if (num1 == num2) {
            Prompt.imprimir("Sequência de números informados é inválida");
        } else if (num1 > num2) {
            Prompt.imprimir("O número " + num1 + " É maior que o número " + num2);
        } else {
            Prompt.imprimir("O número " + num2 + " É maior que o número " + num1);
        }

    }
}
