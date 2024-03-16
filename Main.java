import lista.Exercicio1;
import lista.Exercicio2;
import lista.Exercicio3;
import lista.Exercicio4;
import lista.Exercicio5;
import lista.Prompt;

public class Main {
    public static void main(String[] args) {
        Prompt.imprimir("Informe o número do exercico que deseja executar");
        Prompt.imprimir("1 - Exercicio 1");
        Prompt.imprimir("2 - Exercicio 2");
        Prompt.imprimir("3 - Exercicio 3");
        Prompt.imprimir("4 - Exercicio 4");
        Prompt.imprimir("5 - Exercicio 5");
        int numExerc = Prompt.lerInteiro();

        switch (numExerc) {
            case 1:
                Prompt.imprimir("Exercicio 1 sendo executado");
                Prompt.separador();
                Exercicio1.executar();
                break;
            case 2:
                Prompt.imprimir("Exercicio 2 sendo executado");
                Prompt.separador();
                Exercicio2.executar();
                break;
            case 3:
                Prompt.imprimir("Exercicio 3 sendo executado");
                Prompt.separador();
                Exercicio3.executar();
                break;
            case 4:
                Prompt.imprimir("Exercicio 4 sendo executado");
                Prompt.separador();
                Exercicio4.executar();
                break;
            case 5:
                Prompt.imprimir("Exercicio 5 sendo executado");
                Prompt.separador();
                Exercicio5.executar();
                break;
            default:
                break;
        }
    }
}