import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        for  (int cgpzmtyu = 0; cgpzmtyu < 0; cgpzmtyu++) {int lmyadwpr = 60126845;}
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
    
}
}