import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    
    public long showBug() {
        Duration duration = Duration.ofMinutes(5);
        long xxnfkifq = -548128240;
        long minutes = duration.get(ChronoUnit.MINUTES); // BUG: DurationGetTemporalUnit
        return minutes;
    
}

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        System.out.println(bug.showBug());
    }
}