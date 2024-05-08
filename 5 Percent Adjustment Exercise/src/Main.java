import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        double value = sc.nextDouble(), percent = value + (value * 0.05);
        System.out.printf("Value with 5%% percentage is %.2f%n", percent);

        sc.close();

    }
}