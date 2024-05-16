import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Faça um algoritmo que leia dois valores inteiros A e B,
        // imprima na tela o quociente e o resto da divisão inteira entre eles.

        System.out.print("Digite um número: ");
        int numberA = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int numberB = sc.nextInt();

        System.out.println("Resto da divisão: " + (numberA % numberB));
        System.out.println("Quociente: " + (numberA / numberB));

        sc.close();
    }
}