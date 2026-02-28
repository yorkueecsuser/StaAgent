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

// Mutant code with renaming

class DurationExampleMutant {

    public long showBug() {
        Duration d = Duration.ofDays(1); // Renaming 'duration' to 'd'
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = d.get(ChronoUnit.DAYS); // Use the renamed variable 'd'
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        DurationExampleMutant exampleMutant = new DurationExampleMutant();
        exampleMutant.showBug();
    }
}