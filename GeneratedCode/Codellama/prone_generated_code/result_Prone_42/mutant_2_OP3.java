import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        boolean unreachableCondition = false;
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println(duration);
        }
    }
}