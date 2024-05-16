import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            int tabuada = number * i;
            System.out.printf("%d x %d = %d\n", i, number, tabuada);
        }


        sc.close();
    }
}