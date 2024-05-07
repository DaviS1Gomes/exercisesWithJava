import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        // caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        // imprimir seu valor na tela.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double numberA = sc.nextInt();
        System.out.print("Enter the number: ");
        double numberB = sc.nextInt();

        double variableC;
        if(numberA == numberB) {
            variableC = numberA + numberB;
        }
        else{
            variableC = numberA * numberB;
        }
        System.out.println("The variable is: " + variableC);


        sc.close();

    }
}