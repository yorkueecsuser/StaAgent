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
        } finally {
            // Insert unreachable switch statement
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case -1:
                    System.out.println("This case is unreachable.");
                    break;
                default:
                    // This is the default case
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        // Always returns a value that does not match with any case in the switch statement above
        return 0;
    }
    
    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}