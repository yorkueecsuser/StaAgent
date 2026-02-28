import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

class InstantTemporalUnitExample {

    public void showBug() {
        Instant now = Instant.now();
        TemporalUnit unsupportedUnit = ChronoUnit.WEEKS;
        Instant result = now.plus(1, unsupportedUnit); // BUG: InstantTemporalUnit
        System.out.println(result);

        // Mutant code: Renaming user-defined variable 'unsupportedUnit' to 'x'
        Instant now2 = Instant.now();
        TemporalUnit x = ChronoUnit.WEEKS;
        Instant result2 = now2.plus(1, x); 
        System.out.println(result2);
    }

    public static void main(String[] args) {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug();
    }
}