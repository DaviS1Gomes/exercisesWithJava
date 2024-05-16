import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Locale.setDefault(Locale.US);

        int randomNumber = rand.nextInt(100);
        System.out.println("Numero aleatorio: " + randomNumber);

    }

}