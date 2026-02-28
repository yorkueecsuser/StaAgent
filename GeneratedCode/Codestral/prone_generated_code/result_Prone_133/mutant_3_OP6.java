import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public long showBug(Period period) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This line will never execute.");
        }
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}