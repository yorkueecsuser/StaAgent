import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);
    }
}

// Unreachable switch statement mutant
class DurationTemporalUnitBugMutant {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        switch (false) {
            case true:
                System.out.println("Reachable branch");
                break;
            case false:
                System.out.println("Unreachable branch");
                break;
            default:
                System.out.println("Default branch");
                break;
        }
    }
}