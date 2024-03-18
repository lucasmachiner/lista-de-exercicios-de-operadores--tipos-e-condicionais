package lista;

public class Exercicio7 {
    public static void executar() {
        Prompt.imprimir("Informe um número");
        double num = Prompt.lerDecimal();

        if (num >= 100 && num <= 200) {
            Prompt.imprimir("O número informado está ENTRE o intevalor de 100 e 200");
        } else {
            Prompt.imprimir("O número informado está FORA do intervalo de 100 e 200");
        }
    }
}
