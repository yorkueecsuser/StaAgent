import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

class PeriodFromBug {

    public Period showBug1(Period period) {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is an unreachable if statement.");
        }
        return Period.from(period); // BUG: PeriodFrom
    }

    public void showBug2(Duration duration) {
        try {
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException as expected: " + e.getMessage());
        }
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is another unreachable if statement.");
        }
    }

    public String showBug() {
        StringBuilder result = new StringBuilder();
        
        // Demonstrating Period.from(Period)
        Period period = Period.ofDays(10);
        Period result1 = showBug1(period);
        result.append("Result of Period.from(Period): ").append(result1).append("\n");
        
        // Demonstrating Period.from(Duration)
        Duration duration = Duration.ofHours(5);
        try {
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            result.append("Caught DateTimeException as expected: ").append(e.getMessage()).append("\n");
        }
        
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            result.append("This is yet another unreachable if statement.");
        }
        
        return result.toString();
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        PeriodFromBug bugDemo = new PeriodFromBug();
        System.out.println(bugDemo.showBug());
    }
}