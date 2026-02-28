import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodGetTemporalUnitBug {
    public long showBug(Period period) {
        // Original code
        long hours = period.get(ChronoUnit.HOURS);

        // Mutant code: unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line will never be printed");
                break;
        }

        return hours;
    }

    // A method to simulate a dynamically determined value that is always unreachable
    private int getUnreachableValue() {
        return -1;
    }
}