import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException

        // Unreachable switch statement mutant
        switch (1) {
            case 2:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Reachable code
                System.out.println("This code is reachable");
                break;
        }
    }
}