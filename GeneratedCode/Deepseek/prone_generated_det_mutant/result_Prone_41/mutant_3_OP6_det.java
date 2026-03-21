import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    
    public long showBug() {
        Duration duration = Duration.ofMinutes(5);
        for  (int gpeicysv = 0; gpeicysv < 0; gpeicysv++) {float hiwsmvgg = -807748332;}
        long minutes = duration.get(ChronoUnit.MINUTES); // BUG: DurationGetTemporalUnit
        return minutes;
    
}

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        System.out.println(bug.showBug());
    }
}