import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

class PeriodFromBug {

    public Period showBug1(Period period) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop.");
        }
        return Period.from(period); // BUG: PeriodFrom
    }

    public void showBug2(Duration duration) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop.");
        }
        try {
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException as expected: " + e.getMessage());
        }
    }

    public String showBug() {
        StringBuilder result = new StringBuilder();
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop.");
        }
        
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
        
        return result.toString();
    }

    public static void main(String[] args) {
        PeriodFromBug bugDemo = new PeriodFromBug();
        System.out.println(bugDemo.showBug());
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the while loop is unreachable
        return false;
    }
}