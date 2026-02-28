import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);

        // Introduce a mutation with an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    // A method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false; // This makes the if condition unreachable
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}