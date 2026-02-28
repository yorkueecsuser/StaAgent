import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit

            // Mutation: Adding an unreachable switch statement
            int unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
            switch (unreachableCondition) {
                case 1:
                    System.out.println("This will never be executed.");
                    break;
                default:
                    System.out.println("Default case, also never executed.");
                    break;
            }

            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    // Method to ensure the switch condition is never met
    private int getUnreachableCondition() {
        return 0; // This value will not match any case in the switch statement
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}