import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit

        // Unreachable switch statement mutant
        switch (false) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}