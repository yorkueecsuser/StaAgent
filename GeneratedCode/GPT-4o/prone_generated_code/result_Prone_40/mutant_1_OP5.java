import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class DurationFromExample {

    public Duration showBug1(Duration duration) {
        // Demonstrating the behavior when Duration.from(Duration) is called
        return Duration.from(duration); // BUG: DurationFrom
    }

    public Duration showBug2(Period period) {
        // Demonstrating the behavior when Duration.from(Period) is called
        try {
            // Unreachable switch statement mutant inserted
            int unreachableSwitch = getUnreachableSwitchValue();
            switch (unreachableSwitch) {
                case 1:
                    System.out.println("This is unreachable code in showBug2");
                    break;
                default:
                    break;
            }
            return Duration.from(period); // BUG: DurationFrom
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception: " + e.toString());
            return null;
        }
    }

    private int getUnreachableSwitchValue() {
        // Always returns a value not matching any case in the switch
        return 2;
    }

    public static void main(String[] args) {
        DurationFromExample example = new DurationFromExample();
        
        // Example 1: Expected to return the same duration
        Duration duration = Duration.ofHours(5);
        System.out.println("Result from Duration: " + example.showBug1(duration));

        // Example 2: Expected to throw UnsupportedTemporalTypeException
        Period period = Period.ofDays(1);
        System.out.println("Result from Period: " + example.showBug2(period));
    }
}