import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // BUG: PeriodGetTemporalUnit
        long hours = period.get(ChronoUnit.HOURS); // This will throw UnsupportedTemporalTypeException

        // Mutant code for "Unreachable if-else statement" mutation operator
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed, as getCondition() should always return false
            System.out.println("This is an unreachable block of code");
        } else {
            // This block is actually reachable, but it could be modified to also be unreachable
            System.out.println("This block can be reached under certain conditions");
        }

        return hours;
    }

    private boolean getCondition() {
        // This method should return a dynamic condition that may become true under certain circumstances
        // For the purpose of this mutation, it always returns false to make the block unreachable
        return false;
    }
}