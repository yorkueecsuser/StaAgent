import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

class PeriodFromBug {

    public Period showBug1(Period period) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a unique unreachable if-else statement
        } else {
            // This is a unique unreachable else statement
        }
        return Period.from(period); // BUG: PeriodFrom
    }

    public void showBug2(Duration duration) {
        try {
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException as expected: " + e.getMessage());
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a unique unreachable if-else statement
        } else {
            // This is a unique unreachable else statement
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
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a unique unreachable if-else statement
        } else {
            // This is a unique unreachable else statement
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        PeriodFromBug bugDemo = new PeriodFromBug();
        System.out.println(bugDemo.showBug());
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, making the branches unreachable
        return false;
    }
}