import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        double numberA = sc.nextInt();
        System.out.print("Enter an number: ");
        double numberB = sc.nextInt();
        System.out.print("Enter an number: ");
        double numberC = sc.nextInt();

        double sum = numberA + numberB;
        System.out.println("Sum A and B: " + sum);

        if ((numberC > sum)) System.out.println("C is greater than A and B");
        else System.out.println("C is smaller than A and B");

    }
}