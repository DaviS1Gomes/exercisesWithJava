import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
        // valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valora da hora aula: ");
        double priceHour = sc.nextDouble();
        double priceSalary = priceHour * 8;
        System.out.print("Informe quantas aulas você deu: ");
        int days = sc.nextInt();
        double fixedSalary = priceSalary * days;
        System.out.print("Informe a porcentagem do desconto do INSS: ");
        double inssDiscount = sc.nextDouble();
        double salary = fixedSalary - (fixedSalary * (inssDiscount/100));

        System.out.printf("O Salário liquido é de %.2f%n", salary);

        sc.close();
    }
}