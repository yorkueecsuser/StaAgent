import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        Instant mutatedInstant = instant.plus(1, ChronoUnit.WEEKS);
        // Mutant code added: Duplication of assignment
        Instant duplicatedMutantInstant = mutatedInstant.plus(1, ChronoUnit.WEEKS);
        return mutatedInstant;
    }
}