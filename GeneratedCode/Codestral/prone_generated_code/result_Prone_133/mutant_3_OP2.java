import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Original code
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException

        // Mutant code
        long duplicateHours = period.get(ChronoUnit.HOURS); // Duplicate of the original line

        // Return the original result
        return hours;
    }
}