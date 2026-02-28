import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);
        
        // Unreachable if-else statement mutation
        boolean condition = getFalseCondition(); // Dynamically determining the condition at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Existing code remains unaffected
            System.out.println("This is part of the original code execution.");
        }
    }

    // A method that returns false to simulate an unreachable if-else statement
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}