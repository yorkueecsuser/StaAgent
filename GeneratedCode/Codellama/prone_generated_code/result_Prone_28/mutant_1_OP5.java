import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Unreachable switch statement mutant
        switch (Boolean.FALSE) {
            case false:
                System.out.println("This branch is unreachable");
                break;
            case true:
                System.out.println("This branch is also unreachable");
                break;
            default:
                System.out.println("This default branch is also unreachable");
                break;
        }
    }
}