import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);
    }
}

// Renaming mutant
class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long x = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(x);
    }
}