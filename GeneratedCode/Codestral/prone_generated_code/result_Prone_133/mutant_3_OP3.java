import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Added unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        // Original code
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the if statement unreachable
        return false;
    }
}