import java.util.Random;

class AlwaysThrowsBug {
    public int showBug(int n) {
        int deadStore; // Dead Store mutant
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        } else {
            Random rand = new Random();
            deadStore = rand.nextInt(); // Using the dead store mutant
        }
        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}