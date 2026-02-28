import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodGetTemporalUnitExample {

    // Method to demonstrate the bug
    public int showBug(ChronoUnit unit) {
        Period period = Period.of(2, 3, 4);
        return (int) period.get(unit); // BUG: PeriodGetTemporalUnit

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case is always executed
                System.out.println("This is a reachable case.");
                break;
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true for testing purposes
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