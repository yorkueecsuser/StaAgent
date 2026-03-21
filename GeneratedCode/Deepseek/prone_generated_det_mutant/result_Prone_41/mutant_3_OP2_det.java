import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
public long showBug() {
    Duration duration = Duration.ofMinutes(5);
    long minutes = duration.get(ChronoUnit.MINUTES);
    minutes = duration.get(ChronoUnit.MINUTES);
    return minutes;
}

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        System.out.println(bug.showBug());
    }
}