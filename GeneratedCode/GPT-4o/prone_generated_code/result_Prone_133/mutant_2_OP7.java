import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        
        // Introducing an unreachable while loop
        boolean conditionWhile = getCondition();  // Using a non-final variable for the condition
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }
        
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
    
    // Method to simulate a condition that always returns false for the while loop
    private boolean getCondition() {
        return false;
    }
}