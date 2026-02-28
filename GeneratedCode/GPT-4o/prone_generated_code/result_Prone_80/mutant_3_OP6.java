import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);
        
        // Introducing an unreachable for loop as required by the mutation operator
        boolean executeLoop = getCondition();  // Using a method to simulate a runtime condition
        for (int i = 0; executeLoop; i++) {
            // This block of code is unreachable
            System.out.println("Unreachable code inside for loop");
        }
    }
    
    // A method to simulate a runtime condition that returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}