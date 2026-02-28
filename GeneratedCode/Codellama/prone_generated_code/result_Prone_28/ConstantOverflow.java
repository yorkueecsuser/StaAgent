import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Mutation: Unreachable for loop
        for (int i = 0; false; i++) {
            // code to be executed if the loop is reachable
        }
    }
}