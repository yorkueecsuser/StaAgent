import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long qjeocgcu = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return qjeocgcu;
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