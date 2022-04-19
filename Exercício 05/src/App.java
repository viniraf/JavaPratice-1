import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        //5. Construa um algoritmo que calcule o antecessor e sucessor de um número qualquer.

        int numero;
        int antecessor;
        int sucessor;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = entrada.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        

        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);
    }
}
