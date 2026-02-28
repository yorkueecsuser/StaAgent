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
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();

        // Inserting unreachable if-else branch
        boolean shouldRun = example.getCondition();
        if (shouldRun) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("Executing main method logic.");
        }
    }
}