import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int tabuada = i * j;
                System.out.printf("%d * %d = %d\n", i, j, tabuada);
            }
        }

    }
}