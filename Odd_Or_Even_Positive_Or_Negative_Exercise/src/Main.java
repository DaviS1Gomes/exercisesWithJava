import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        double number = sc.nextDouble();

        if (number % 2 == 0) System.out.print("This number is even, ");
        else if (number % 2 != 0) System.out.println("This number is odd, ");
        else System.out.println("Error");

        if (number < 0) System.out.print("negative.");
        else System.out.print("positive.");


        sc.close();
    }
}