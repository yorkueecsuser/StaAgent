import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        // Mutant: Add unreachable if statement
        if (isUnreachableCondition()) {
            System.out.println("This if statement is unreachable.");
        }
        return Duration.from(duration);
    }

    // Method to determine dynamically if the condition is unreachable
    private boolean isUnreachableCondition() {
        // For demonstration purposes, this method always returns false
        // In a real scenario, the condition could be dynamically determined
        return false;
    }

    public Period showBug2(Period period) {
        return Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24));
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration duration = Duration.ofHours(2);
        System.out.println(bug.showBug1(duration));

        Period period = Period.ofDays(10);
        try {
            System.out.println(bug.showBug2(period));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}