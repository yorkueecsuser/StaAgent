import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            boolean fnaaxyov = false;while (fnaaxyov && true && true && true && false && false && true && false && true && false && false && false) {float twtwtohn = 946886092;}
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