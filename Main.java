import java.util.Scanner;

import lista.Exercicio1;
import lista.Exercicio10;
import lista.Exercicio11;
import lista.Exercicio12;
import lista.Exercicio2;
import lista.Exercicio3;
import lista.Exercicio4;
import lista.Exercicio5;
import lista.Exercicio6;
import lista.Exercicio7;
import lista.Exercicio8;
import lista.Exercicio9;
import lista.Prompt;

public class Main {
    public static void main(String[] args) {
        Prompt.imprimir("Informe o número do exercico que deseja executar");
        Prompt.imprimir("1 - Exercicio 1");
        Prompt.imprimir("2 - Exercicio 2");
        Prompt.imprimir("3 - Exercicio 3");
        Prompt.imprimir("4 - Exercicio 4");
        Prompt.imprimir("5 - Exercicio 5");
        Prompt.imprimir("6 - Exercicio 6");
        Prompt.imprimir("7 - Exercicio 7");
        Prompt.imprimir("8 - Exercicio 8");
        Prompt.imprimir("9 - Exercicio 9");
        Prompt.imprimir("10 - Exercicio 10");
        Prompt.imprimir("11 - Exercicio 11");
        Prompt.imprimir("12 - Exercicio 12");
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
            case 6:
                Prompt.imprimir("Exercicio 6 sendo executado");
                Prompt.separador();
                Exercicio6.executar();
                break;
            case 7:
                Prompt.imprimir("Exercicio 7 sendo executado");
                Prompt.separador();
                Exercicio7.executar();
                break;
            case 8:
                Prompt.imprimir("Exercicio 8 sendo executado");
                Prompt.separador();
                Exercicio8.executar();
                break;
            case 9:
                Prompt.imprimir("Exercicio 9 sendo executado");
                Prompt.separador();
                Exercicio9.executar();
                break;
            case 10:
                Prompt.imprimir("Exercicio 10 sendo executado");
                Prompt.separador();
                Exercicio10.executar();
                break;
            case 11:
                Prompt.imprimir("Exercicio 11 sendo executado");
                Prompt.separador();
                Exercicio11.executar();
                break;
            case 12:
                Prompt.imprimir("Exercicio 12 sendo executado");
                Prompt.separador();
                Exercicio12.executar();
                break;
            default:
                break;
        }
    }
}