import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        try {
            // Introduce an unreachable if-else statement with a condition that is always false at runtime
            boolean shouldExecute = isConditionTrue();
            if (shouldExecute) {
                System.out.println("This branch will never execute.");
            } else {
                return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
            }
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
        return 0; // Default return, though unreachable due to the structure
    }
    
    // Helper method to ensure the condition is always false
    private boolean isConditionTrue() {
        return false;
    }
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}