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
            int unreachableValue = getUnreachableValue(); // Use a dynamic method call
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    // No code needed
                    break;
            }
            return -1;
        }
    }
    
    private int getUnreachableValue() {
        return 2; // This makes the switch case always fall through to 'default'
    }

    public static void main(String[] args) {
        PeriodBugExample example = new PeriodBugExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}