import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        //9. Construa um algoritmo que some o preço de dois produtos quaisquer.

        double preco_1;
        double preco_2;
        double soma;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço (em reais) do primeiro produto:");
        preco_1 = entrada.nextDouble();
        System.out.println("Digite o preço (em reais) do segundo produto:");
        preco_2 = entrada.nextDouble();

        soma = preco_1 + preco_2;

        System.out.println("R$ " + preco_1 + " + " + "R$ " + preco_2 + " = " + "R$ " +soma);

    }
}
