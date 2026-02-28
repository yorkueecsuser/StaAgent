import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
        // Adding Mutant Code
        long duplicateHours = period.get(ChronoUnit.HOURS); // Duplicate of the line above
        return hours; // Returning the original value
    }
}