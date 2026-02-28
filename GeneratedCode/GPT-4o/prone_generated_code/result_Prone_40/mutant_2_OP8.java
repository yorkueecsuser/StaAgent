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
            return Duration.from(period); // BUG: DurationFrom
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception: " + e.toString());
            return null;
        }
    }
    
    // Mutant method with renamed variable for showBug1
    public Duration showBug1Mutant(Duration x) {
        // Demonstrating the behavior when Duration.from(Duration) is called
        return Duration.from(x);
    }
    
    // Mutant method with renamed variable for showBug2
    public Duration showBug2Mutant(Period y) {
        // Demonstrating the behavior when Duration.from(Period) is called
        try {
            return Duration.from(y);
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception: " + e.toString());
            return null;
        }
    }

    public static void main(String[] args) {
        DurationFromExample example = new DurationFromExample();
        
        // Example 1: Expected to return the same duration
        Duration duration = Duration.ofHours(5);
        System.out.println("Result from Duration: " + example.showBug1(duration));
        System.out.println("Result from Duration Mutant: " + example.showBug1Mutant(duration));

        // Example 2: Expected to throw UnsupportedTemporalTypeException
        Period period = Period.ofDays(1);
        System.out.println("Result from Period: " + example.showBug2(period));
        System.out.println("Result from Period Mutant: " + example.showBug2Mutant(period));
    }
}