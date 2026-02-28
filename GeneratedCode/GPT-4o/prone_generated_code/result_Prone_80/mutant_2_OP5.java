import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);

        // Mutation Operator: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case -1:
                System.out.println("This is unreachable");
                break;
            default:
                // No operation
                break;
        }
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }

    // Method to provide a non-final value for the switch statement
    private int getUnreachableValue() {
        return 0;
    }
}