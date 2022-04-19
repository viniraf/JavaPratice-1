import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //4. Construa um algoritmo que calcule a área de um retângulo.

        double base;
        double altura;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o base do retangulo");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do retangulo");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("A area do retangulo é: " + area);
    }
}
