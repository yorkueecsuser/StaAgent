import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(10);
        System.out.println(duration.get(ChronoUnit.HOURS)); // BUG: DurationGetTemporalUnit
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
            System.out.println("This is an unreachable statement!");
            break;
        }
    }

    public static boolean getCondition() {
        return false;
    }
}