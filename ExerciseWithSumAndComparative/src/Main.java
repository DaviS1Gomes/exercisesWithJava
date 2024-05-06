import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que leia os valores de A, B, C e
        // em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        double numberA = sc.nextInt();
        System.out.print("Enter an number: ");
        double numberB = sc.nextInt();
        System.out.print("Enter an number: ");
        double numberC = sc.nextInt();

        double sum = numberA + numberB;
        System.out.println("Sum A and B: " + sum);

        if ((numberC > sum)) System.out.println("C is greater than A and B");
        else System.out.println("C is smaller than A and B");

        sc.close();
    }
}