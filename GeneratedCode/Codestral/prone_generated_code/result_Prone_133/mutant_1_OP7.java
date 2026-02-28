import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        while (isFalse()) {
            // This while loop is unreachable
            System.out.println("This line will never be executed!");
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private boolean isFalse() {
        return false;
    }
}