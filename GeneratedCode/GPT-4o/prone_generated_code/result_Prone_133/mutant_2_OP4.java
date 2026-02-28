import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        try {
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    }
    
    private boolean getUnreachableCondition() {
        return false; // This method simulates an always false condition
    }
    
    public void unreachableBranchExample() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable if-branch.");
        } else {
            System.out.println("This branch is always executed.");
        }
    }

    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
        
        example.unreachableBranchExample();
    }
}