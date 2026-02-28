import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);

        // Mutation: Unreachable if-else statement
        boolean condition = getCondition(); // Using a method to avoid compile-time constant
        if (condition) {
            // This block is theoretically unreachable if 'getCondition' always returns false
            System.out.println("This code is unreachable.");
        } else {
            // This block is reachable
            System.out.println("This code is reachable.");
        }
    }

    // This method simulates dynamic condition evaluation
    private boolean getCondition() {
        return false; // Always returns false to simulate unreachable branch
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}