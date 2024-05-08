import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final double MINIMUM_SALARY = 1293.20;
    public static void main(String[] args) {
        //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salary = sc.nextDouble();
        double result = salary / MINIMUM_SALARY;
        System.out.printf("Você ganha %.2f sálarios", result);

        sc.close();
    }
}