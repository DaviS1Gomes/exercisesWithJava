import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int successorNumber = number + 1;
        int predecessorNumber = number - 1;

        System.out.print("Predecessor is " + predecessorNumber + ", Successor is " + successorNumber);


        sc.close();
    }
}