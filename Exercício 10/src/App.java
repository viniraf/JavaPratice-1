import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        //10. Construa um algoritmo que peça o nome, idade, peso e altura de um usuário e imprima na tela.

        String nome;
        int idade;
        double peso;
        double altura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite o seu peso (em kg): ");
        peso = entrada.nextDouble();
        System.out.println("Digite a sua altura (em cm): ");
        altura = entrada.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }
}
