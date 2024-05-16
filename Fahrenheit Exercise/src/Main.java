import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
        // Imprima na tela as duas temperaturas.
        //Fórmula: C = (5 * ( F-32) / 9)

        System.out.print("Coloque o valor da temperatura em Fahrenheit: ");
        double temperatureFahrenheit = sc.nextDouble();

        double fahrenheitToCelsius = 5*(temperatureFahrenheit - 32)/9;
        System.out.printf("Temperatura em Celsius: %.2f%n", fahrenheitToCelsius);


        sc.close();
    }
}