import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Added a dead store
        int unusedVariable = 10;

        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}