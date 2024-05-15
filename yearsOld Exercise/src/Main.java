import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Faça um algoritmo que leia o ano em que uma pessoa nasceu,
        // imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
        // consideração o ano com 365 dias e o mês com 30 dias.

        System.out.print("Digite o ano que nasceu: ");
        int ano = sc.nextInt();


        sc.close();
    }
}