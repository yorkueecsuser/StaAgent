import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);

        // Unreachable switch statement mutation
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}