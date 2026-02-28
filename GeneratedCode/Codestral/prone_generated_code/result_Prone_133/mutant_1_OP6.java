import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        boolean condition = false;
        for (int i = 0; i < 1 && condition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }

    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }
}