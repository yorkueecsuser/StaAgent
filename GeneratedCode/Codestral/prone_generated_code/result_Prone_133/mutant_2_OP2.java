import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Original code
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException

        // Mutated code
        long duplicatedHours = period.get(ChronoUnit.HOURS); // Duplicated assignment statement

        return hours;
    }
}