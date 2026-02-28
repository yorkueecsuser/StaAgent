import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    private boolean getFalseCondition() {
        return false;
    }

    public long showBug(Period period) {
        // Original code
        long hours = period.get(ChronoUnit.HOURS);

        // Mutation Operator: Unreachable if-else statement
        if (getFalseCondition()) {
            // Unreachable code block
            System.out.println("This is an unreachable code block");
        } else {
            // This else block is also unreachable as the condition is always false
            System.out.println("This else block is also unreachable");
        }

        return hours;
    }
}