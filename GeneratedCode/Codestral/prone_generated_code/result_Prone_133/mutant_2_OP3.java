import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable mutant code
            throw new RuntimeException("This line should be unreachable!");
        }
        // BUG: PeriodGetTemporalUnit
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private boolean getCondition() {
        // This method returns false to make the if statement unreachable
        return false;
    }
}