import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        //3. Construa um algoritmo que calcule o dobro de um número qualquer.

        double numero;
        double numero_dobro;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        numero = entrada.nextDouble();

        numero_dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é igual a " + numero_dobro);
    }
}
