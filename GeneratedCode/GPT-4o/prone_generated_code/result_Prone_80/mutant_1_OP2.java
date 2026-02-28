import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        Instant resultDuplicate = now.plus(1, unsupportedUnit); // Duplicated assignment
        System.out.println(result);
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}