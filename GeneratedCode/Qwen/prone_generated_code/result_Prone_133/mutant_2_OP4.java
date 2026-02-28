import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodGetTemporalUnitExample {

    // Method to demonstrate the bug
    public int showBug(ChronoUnit unit) {
        Period period = Period.of(2, 3, 4);
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block is reachable based on the condition
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because getCondition() always returns true
            System.out.println("This is an unreachable block.");
        }
        return (int) period.get(unit); // BUG: PeriodGetTemporalUnit
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // Always returns true to make the else block unreachable
    }

    public static void main(String[] args) {
        PeriodGetTemporalUnitExample example = new PeriodGetTemporalUnitExample();
        try {
            System.out.println(example.showBug(ChronoUnit.YEARS));  // This will work fine
            System.out.println(example.showBug(ChronoUnit.MONTHS)); // This will work fine
            System.out.println(example.showBug(ChronoUnit.DAYS));   // This will work fine
            System.out.println(example.showBug(ChronoUnit.HOURS));  // This will throw an exception
        } catch (UnsupportedTemporalTypeException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
    }
}