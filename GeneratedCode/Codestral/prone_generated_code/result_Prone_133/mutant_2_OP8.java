import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    public long showMutant(Period p) {
        // MUTANT: Renaming
        return p.get(ChronoUnit.DAYS); // Renamed variable 'period' to 'p' and changed ChronoUnit to DAYS
    }
}