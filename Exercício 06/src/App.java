import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //6. Construa um algoritmo que exemplifique 4 operações aritméticas.

        double numero_1;
        double numero_2;
        double adicao_numero;
        double subtracao_numero;
        double multiplicacao_numero;
        double divisao_numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite primeiro número:");
        numero_1 = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        numero_2 = entrada.nextDouble();
        adicao_numero = numero_1 + numero_2;
        subtracao_numero = numero_1 - numero_2;
        multiplicacao_numero = numero_1 * numero_2;
        divisao_numero = numero_1 / numero_2;

        System.out.println("O número " + numero_1 + " + o número " + numero_2 + " é igual a: " + adicao_numero);
        System.out.println("O número " + numero_1 + " - o número " + numero_2 + " é igual a: " + subtracao_numero);
        System.out.println("O número " + numero_1 + " x pelo número " + numero_2 + " é igual a: " + multiplicacao_numero);
        System.out.println("O número " + numero_1 + " ÷ pelo número " + numero_2 + " é igual a: " + divisao_numero);

    }
}
