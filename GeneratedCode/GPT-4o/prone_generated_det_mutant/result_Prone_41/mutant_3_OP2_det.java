import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {
public long showBug() {
    Duration duration = Duration.ofDays(1);
    duration = Duration.ofDays(1);
    try { long days = duration.get(ChronoUnit.DAYS); return days; } catch(UnsupportedTemporalTypeException e){ System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage()); return - 1; }
}

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}