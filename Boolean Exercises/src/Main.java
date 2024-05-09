import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true or false? ");
        boolean input = sc.nextBoolean();
        System.out.print("Enter true or false? ");
        boolean input2 = sc.nextBoolean();

        if(input & input2) System.out.println("Both are true!");
        else if (!input && !input2) System.out.println("Both are false!");
        else System.out.println("One false");


        sc.close();
    }
}