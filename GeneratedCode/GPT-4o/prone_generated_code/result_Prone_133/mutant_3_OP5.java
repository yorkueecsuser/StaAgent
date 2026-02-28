import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class PeriodBugExample {

    public int showBug() {
        Period period = Period.of(1, 2, 3);
        try {
            // Inserted unreachable switch statement
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
                default:
                    System.out.println("Default case");
            }
            
            return (int) period.get(ChronoUnit.SECONDS); // BUG: PeriodGetTemporalUnit
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            return -1;
        }
    }
    
    private int getUnreachableValue() {
        // This method returns a value that ensures the switch statement is unreachable
        return 0; // Using 0 which doesn't match the case 1
    }
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}