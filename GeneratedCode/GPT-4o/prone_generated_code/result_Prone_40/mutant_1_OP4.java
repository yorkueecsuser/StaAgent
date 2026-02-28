import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class DurationFromExample {

    public Duration showBug1(Duration duration) {
        // Demonstrating the behavior when Duration.from(Duration) is called
        boolean condition = getFalseCondition(); // Unreachable if-else statement
        if (condition) {
            System.out.println("This code is unreachable because the condition is always false.");
        } else {
            return Duration.from(duration); // BUG: DurationFrom
        }
        return null; // This return is redundant but ensures the method compiles
    }

    public Duration showBug2(Period period) {
        // Demonstrating the behavior when Duration.from(Period) is called
        boolean condition = getFalseCondition(); // Unreachable if-else statement
        if (condition) {
            System.out.println("This code is unreachable because the condition is always false.");
        } else {
            try {
                return Duration.from(period); // BUG: DurationFrom
            } catch (UnsupportedOperationException e) {
                System.out.println("Caught exception: " + e.toString());
                return null;
            }
        }
        return null; // This return is redundant but ensures the method compiles
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
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