import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
        // conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
        // Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
        //
        // Tabela de Código de Condições de Pagamento
        // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
        // 2 - À Vista no cartão de crédito, recebe 10% de desconto
        // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
        // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do produto: R$ ");
        double valor = sc.nextDouble();
        System.out.println();

        System.out.print("Escolha o método de pagamento: \n" +
                "Tabela de Código de Condições de Pagamento\n" +
                "1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%\n");
        System.out.println();

        System.out.print("Escolha o método: ");
        int methods = sc.nextInt();

        double priceWithDiscount;
        switch (methods) {
            case 1:
                System.out.println("Método escolhido: Dinheiro ou pix");
                System.out.print("Valor do total do produto: R$ " + valor + "\n");
                priceWithDiscount = valor - (valor * 0.15);
                System.out.printf("Valor do produto com desconto: R$ %.2f\n", priceWithDiscount);
                break;

            case 2:
                System.out.println("Método escolhido: Cartão de crédito");
                System.out.print("Valor do total do produto: R$ " + valor + "\n");
                priceWithDiscount = valor - (valor * 0.10);
                System.out.printf("Valor do produto com desconto: R$ %.2f\n", priceWithDiscount);
                break;

            case 3:
                System.out.println("Método escolhido: Parcelado em 2x sem juros");
                System.out.print("Valor do total do produto: R$ " + valor + "\n");
                break;

            case 4:
                System.out.println("Método escolhido: Parcelado em 3x com juros");
                System.out.print("Valor do total do produto: R$ " + valor + "\n");
                priceWithDiscount = valor + (valor * 0.10);
                System.out.printf("Valor do produto com juros: R$ %.2f\n", priceWithDiscount);
                break;

            default:
                System.out.println("Valor invalido!");
                break;
        }

        sc.close();
    }
}