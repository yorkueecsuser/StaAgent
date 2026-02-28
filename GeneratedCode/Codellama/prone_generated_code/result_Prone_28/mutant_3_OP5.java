import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                // This branch is unreachable because the switch expression is always 0.
                System.out.println("Reachable branch");
                break;
            default:
                // This branch is unreachable because the switch expression is always 0.
                System.out.println("Unreachable branch");
                break;
        }
    }

    // Helper method to avoid compile-time constants
    public static int getValue() {
        return 0;
    }
}