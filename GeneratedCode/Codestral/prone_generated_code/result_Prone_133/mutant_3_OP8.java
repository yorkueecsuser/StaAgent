import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        Period p = period; // Added mutation: Renamed 'period' to 'p'
        // BUG: PeriodGetTemporalUnit
        return p.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}