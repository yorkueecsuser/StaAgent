import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);
        
        // Mutation: Adding unreachable if-else statement
        boolean runCondition = getFalseCondition();
        if (runCondition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the else branch.");
        }
    }
    
    // Helper method to ensure the condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}