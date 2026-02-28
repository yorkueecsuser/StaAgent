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
    
    // Mutant code: Unreachable switch statement
    private void unreachableSwitch() {
        int condition = getCondition();
        switch (condition) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    private int getCondition() {
        // This method returns a value that ensures the switch statement is unreachable
        return 3; // always returning 3 makes switch cases unreachable
    }

    public static void main(String[] args) {
        DurationFromExample example = new DurationFromExample();
        
        // Example 1: Expected to return the same duration
        Duration duration = Duration.ofHours(5);
        System.out.println("Result from Duration: " + example.showBug1(duration));

        // Example 2: Expected to throw UnsupportedTemporalTypeException
        Period period = Period.ofDays(1);
        System.out.println("Result from Period: " + example.showBug2(period));

        // Invoke mutant method to ensure it's part of the program execution
        example.unreachableSwitch();
    }
}