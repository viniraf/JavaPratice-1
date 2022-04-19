import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        //8. Construa um algoritmo que peça 4 notas e calcule a média dessas notas.

        double nota_1;
        double nota_2;
        double nota_3;
        double nota_4;
        double media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        nota_1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        nota_2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota");
        nota_3 = entrada.nextDouble();
        System.out.println("Digite a quarta nota");
        nota_4 = entrada.nextDouble();

        media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
        
        System.out.println("A média das notas é igual a: " + media);

        

    }
}
