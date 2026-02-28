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
    }
}

// Mutant Code
class DurationExampleMutant {

    public long showBugMutant() {
        Duration x = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long y = x.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return y;
        } catch (UnsupportedTemporalTypeException z) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + z.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        DurationExampleMutant mutantExample = new DurationExampleMutant();
        mutantExample.showBugMutant();
    }
}