import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);

        // Unreachable switch statement mutant
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}