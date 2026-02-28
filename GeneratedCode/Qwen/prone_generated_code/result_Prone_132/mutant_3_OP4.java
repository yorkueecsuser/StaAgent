import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

class PeriodFromBug {

    public Period showBug1(Period period) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
        } else {
            System.out.println("This is an unreachable else block.");
        }
        return Period.from(period); // BUG: PeriodFrom
    }

    public void showBug2(Duration duration) {
        try {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable if-else statement
            } else {
                System.out.println("This is an unreachable else block.");
            }
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException as expected: " + e.getMessage());
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
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Unreachable if-else statement
            } else {
                System.out.println("This is an unreachable else block.");
            }
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            result.append("Caught DateTimeException as expected: ").append(e.getMessage()).append("\n");
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        PeriodFromBug bugDemo = new PeriodFromBug();
        System.out.println(bugDemo.showBug());
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, but not a compile-time constant
        return 1 > 2;
    }
}