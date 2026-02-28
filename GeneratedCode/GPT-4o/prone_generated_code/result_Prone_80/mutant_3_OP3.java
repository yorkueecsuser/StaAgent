import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);
        
        // Unreachable if statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return Instant.now().isBefore(Instant.now());
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}