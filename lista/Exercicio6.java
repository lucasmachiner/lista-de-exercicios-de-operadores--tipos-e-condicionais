package lista;

public class Exercicio6 {
    public static void executar() {
        Prompt.imprimir("Informe a temperatura em Celsius");
        double valueCelsius = Prompt.lerDecimal();
        Double convertion = (9 * valueCelsius + 160) / 5;

        Prompt.imprimir("Temperatura em Fahreinheit " + convertion);
    }
}
