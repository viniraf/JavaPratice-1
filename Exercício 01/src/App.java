import java.util.Scanner;

//import java.util.Scanner; 
import java.util.*; 

public class App {
    public static void main(String[] args) throws Exception {

      //1 - Construa um algoritmo que peça o nome do usuário e imprima na tela.

      //variaveis

      String nome; 
      Scanner entrada = new Scanner(System.in); 
      
      System.out.println("Digite seu nome:"); 
      nome = entrada.nextLine();
      System.out.println("Nome digitado: " + nome);

    }
}
