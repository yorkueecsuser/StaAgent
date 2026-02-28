import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        // Inserting unreachable while loop
        boolean unreachableWhileCondition = getUnreachableCondition();
        while (unreachableWhileCondition) {
            System.out.println("This line is unreachable.");
        }

        Period period = Period.of(1, 2, 3);
        try {
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    }
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}