import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        
        // Inserting unreachable for loop as per Mutation Operator
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never execute
            System.out.println("This is an unreachable for loop block");
        }
        
        try {
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    }
    
    // Method to provide a runtime condition for unreachable code
    private boolean getUnreachableCondition() {
        return false; // This keeps the for loop from executing
    }

    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}