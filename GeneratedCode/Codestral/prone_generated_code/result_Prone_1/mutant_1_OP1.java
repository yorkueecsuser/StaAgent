import java.util.Random;

class AlwaysThrowsBug {
    public int showBug(int n) {
        int deadStoreVar; // Inserting dead store variable
        Random rand = new Random();
        deadStoreVar = rand.nextInt(); // Assigning a random value to the dead store variable

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n;
    }
}