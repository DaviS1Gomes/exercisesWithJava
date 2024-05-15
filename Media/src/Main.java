import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque suas 3 notas: ");
        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        System.out.print("Nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota: ");
        double nota3 = sc.nextDouble();

        double MEDIA = (nota + nota2 + nota3) / 3;

        System.out.print("A média do nota: ");
        System.out.printf("%.2f", MEDIA);

        sc.close();
    }
}