import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Faça um algoritmo que receba um valor A e B,
        // troque o valor de A por B e o valor de B por A e imprima na tela os valores.

        System.out.print("Coloque o Número A: ");
        double numberA = sc.nextDouble();
        System.out.print("Coloque o Número B: ");
        double numberB = sc.nextDouble();

        double changeNumbers;
        changeNumbers = numberA;
        numberA = numberB;
        numberB = changeNumbers;

        System.out.println("A troca de valores foi feita com sucesso.");
        System.out.println("Numero A agora vale: " + numberA);
        System.out.println("Numero B agora vale: " + numberB);

        sc.close();
    }
}