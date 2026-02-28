import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Mutant code
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is reachable.");
        }
    }
}