import java.util.Random;

class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final Random rand = new Random(); // Random object for generating dead store

    public long showBug() {
        int deadStore = rand.nextInt(); // Unused variable declaration with int type
        return NANOS_PER_DAY;
    }
}