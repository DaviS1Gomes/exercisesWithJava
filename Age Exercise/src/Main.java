import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Faça algoritmo que leia o nome e a idade de uma peso
        // e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println(name);
            System.out.println("Menor de idade");
        }
        else {
            System.out.println(name);
            System.out.println("Maior de idade");
        }



        sc.close();
    }

}