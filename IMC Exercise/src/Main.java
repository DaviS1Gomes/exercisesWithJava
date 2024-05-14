import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
        // leia o seu peso e sua altura e imprima na tela sua condição
        //de acordo com a tabela abaixo:
        //Fórmula do IMC = peso / (altura) ²
        //Tabela Condições IMC
        // Abaixo de 18,5   | Abaixo do peso
        // Entre 18,6 e 24,9 | Peso ideal (parabéns)
        // Entre 25,0 e 29,9 | Levemente acima do peso
        // Entre 30,0 e 34,9 | Obesidade grau I
        // Entre 35,0 e 39,9 | Obesidade grau II (severa)
        // Maior ou igual a 40 | Obesidade grau III (mórbida)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.print("Peso: ");
            double weight = sc.nextDouble();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            double IMC = weight / (height * height);
            System.out.printf("Your IMC is: %.2f%n", IMC);
            if (IMC < 18.5) {
                System.out.println("Abaixo do peso");
            }
            else if(IMC >= 18.5 && IMC < 24.9) {
                System.out.println("Peso ideal (Parabéns) ");
            }
            else if(IMC >= 25 && IMC < 29.9) {
                System.out.println("Levemente acima do peso");
            }
            else if(IMC >= 30 && IMC < 34.9) {
                System.out.println("Obesidade grau I");
            }
            else if(IMC >= 35 && IMC < 39.9) {
                System.out.println("Obesidade grau II (severa) ");
            }
            else if(IMC >= 40 && IMC < 41.9) {
                System.out.println("Obesidade grau III (mórbida) ");
            }


        sc.close();
    }
}