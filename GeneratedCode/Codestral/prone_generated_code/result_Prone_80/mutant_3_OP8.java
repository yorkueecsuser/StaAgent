import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instantParameter) {
        // Original code
        return instantParameter.plus(1, ChronoUnit.WEEKS);

        // Mutated code
        Instant temp = instantParameter;
        return temp.plus(1, ChronoUnit.WEEKS);
    }
}