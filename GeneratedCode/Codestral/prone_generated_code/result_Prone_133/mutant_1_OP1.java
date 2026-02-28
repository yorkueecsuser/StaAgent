import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        int deadStoreVariable; // This is the dead store variable as per the mutation operator

        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}