import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException

        // Mutant: Unreachable switch statement
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            int value = 0; // This value will always be 0, making the switch unreachable
            switch(value) {
                case 1:
                    System.out.println("This line should never be printed.");
                    break;
            }
        }

        return hours;
    }

    // Method to return unreachable condition (always false)
    private boolean getUnreachableCondition() {
        return false;
    }
}