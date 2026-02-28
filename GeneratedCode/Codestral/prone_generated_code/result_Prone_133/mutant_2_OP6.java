import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    private boolean getCondition() {
        return false;
    }

    public long showBug(Period period) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable block
            System.out.println("This block will never be executed.");
        }

        // Original code
        return period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException
    }
}