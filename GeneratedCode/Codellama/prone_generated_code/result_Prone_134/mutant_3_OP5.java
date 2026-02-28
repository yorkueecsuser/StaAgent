import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException

        // Mutation Operator: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // unreachable code
                Period unreachableResult = period.plusDays(1);
                break;
            default:
                // unreachable code
                Period unreachableResult = period.plusDays(-1);
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}