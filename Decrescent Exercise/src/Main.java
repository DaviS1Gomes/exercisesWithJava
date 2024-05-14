import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter one number:  ");
            numbers[i] = sc.nextInt();
        }
        int aux;
        for (int i = 0; i < size; i++) {
            if(numbers[i] > numbers[size - 1]) {
                numbers[size - 1] = numbers[i];
                
            }
        }

        sc.close();

    }
}