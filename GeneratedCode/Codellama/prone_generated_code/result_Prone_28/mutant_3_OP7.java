import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Inserting unreachable while loop into the main method
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }
    }
}