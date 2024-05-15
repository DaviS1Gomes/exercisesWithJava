import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
        // imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
        // Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Por favor, coloque suas notas: ");
        System.out.print("Nota 1: ");
        double note1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double note2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double note3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        double note4 = sc.nextDouble();

        double MEDIA = (note1 + note2 + note3 + note4) / 4;
        if(MEDIA >= 7) {
            System.out.println("Nome do aluno: "  + name);
            System.out.printf("%nAprovado, com nota acima de 7 ( %.2f )%n", MEDIA);
        }
        else System.out.println("Reprovado, com nota abaixo de 7 ( " + MEDIA + " )" + "\nNome: " + name);

        sc.close();
    }
}