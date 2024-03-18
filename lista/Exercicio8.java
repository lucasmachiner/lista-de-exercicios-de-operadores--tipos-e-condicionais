package lista;

public class Exercicio8 {
    public static void executar() {
        Prompt.imprimir("Informe um número");
        double num = Prompt.lerDecimal();

        if (num >= 50) {
            Prompt.imprimir("Este número é MAIOR ou IGUAL 50");
        } else {
            Prompt.imprimir("Este número é MENOR que 50");
        }
    }
}
