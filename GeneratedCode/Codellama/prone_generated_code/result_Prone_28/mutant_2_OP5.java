import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable branch");
                break;
            case 2:
                System.out.println("Unreachable branch");
                break;
            default:
                System.out.println("Default branch");
                break;
        }
    }

    private static int getValue() {
        // This method returns 1, which will always make the switch expression evaluate to 1
        return 1;
    }
}