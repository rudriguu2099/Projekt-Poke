import java.util.Random;

public class Rand {
    private static final Random rand = new Random();

    public static boolean next(double chance) {
        if (chance < 0.1 || chance > 100.0) {
            throw new IllegalArgumentException("A chance deve estar entre 1.0 e 100.0");
        }
        return rand.nextDouble() * 100 < chance;
    }
}
