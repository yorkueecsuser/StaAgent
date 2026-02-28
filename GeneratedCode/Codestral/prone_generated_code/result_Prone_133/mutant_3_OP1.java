import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Random;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Original code
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException

        // Dead Store mutant
        int deadStoreVariable = new Random().nextInt();

        return hours;
    }
}