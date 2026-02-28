import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Duplicate assignment statement as per mutation operator description
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            long daysDuplicate = days; // Duplicated assignment statement
            return days; // Original code, returning the original 'days' variable
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}