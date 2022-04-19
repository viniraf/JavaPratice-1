import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        //7 - Construa um algoritmo que converta Celsius/Fahrenheit.
        
        double celsius;
        double fahrenheit;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma temperatura em graus celsius:");
        celsius = entrada.nextDouble();

        fahrenheit = ((celsius) * 9/5) + 32;

        System.out.println(celsius + " °C" + " é igual a " + fahrenheit + " °F");

    }
}
