import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    private int getUnreachableValue() {
        return 2; // A value that does not match any case
    }

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);

        // Inserting unreachable switch statement
        int unreachableCase = getUnreachableValue();
        switch (unreachableCase) {
            case 0:
                System.out.println("This is case 0");
                break;
            case 1:
                System.out.println("This is case 1");
                break;
            // No case for 2, making the switch effectively unreachable
        }
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}