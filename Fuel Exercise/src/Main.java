import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static final int KILOMETERSPERLITER = 12;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
        // sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
        // distância percorrida e a quantidade de litros utilizados para fazer a viagem.
        //Fórmula: distância = tempo x velocidade.
        //          litros usados = distância / 12.

        System.out.print("Quanto tempo gasto em horas? ");
        double time = sc.nextDouble();
        System.out.print("Velocidade média? ");
        double velocity = sc.nextDouble();

        double distance = velocity * time;

        double literTotal = distance/KILOMETERSPERLITER;
        System.out.println(literTotal);



        sc.close();
    }
}