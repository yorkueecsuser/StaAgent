import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    private boolean alwaysFalse() {
        return false;
    }

    public long showBug(Period period) {
        if (alwaysFalse()) {
            // Unreachable if statement mutant
            System.out.println("This line will never be executed.");
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}