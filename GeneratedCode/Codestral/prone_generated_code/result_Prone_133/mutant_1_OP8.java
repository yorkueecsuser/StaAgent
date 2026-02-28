import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        Period p = period; // Added mutant
        return p.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}