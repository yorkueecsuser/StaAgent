import java.util.Random;

class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        int deadStoreVariable; // Added Dead Store
        Random random = new Random();
        deadStoreVariable = random.nextInt(); // Using the variable to avoid compilation error
        return NANOS_PER_DAY;
    }
}