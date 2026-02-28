import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
        
        // Unreachable switch statement mutation
        int condition = getCondition();
        switch (condition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case with no action to ensure the switch is technically correct
                break;
        }
    }

    private static int getCondition() {
        // Return a value that ensures the switch case is never reached, e.g., 0
        return 0;
    }
}