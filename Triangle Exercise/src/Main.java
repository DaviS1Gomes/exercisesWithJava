import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que leia três valores que representam os três lados de um triângulo
        // e verifique se são válidos, determine se o triângulo equilátero, isósceles ou escaleno.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do triangulo: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite o valor do triangulo: ");
        double valor2 = sc.nextDouble();
        System.out.print("Digite o valor do triangulo: ");
        double valor3 = sc.nextDouble();


        if(valor1 + valor2 > valor3 || valor1 + valor3 > valor2 || valor2 + valor3 > valor1){
            if(valor1 == valor2 && valor2 == valor3){
                System.out.println("Equilatero");
            }
            else if(valor1 == valor3 && valor2 == valor2){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Escaleno");
            }
        }
        else{
            System.out.println("Error! Triângulo inválido");
        }


        sc.close();
    }
}