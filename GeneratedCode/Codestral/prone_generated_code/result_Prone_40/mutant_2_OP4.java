import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            throw new IllegalStateException("Unreachable code executed");
        } else {
            // Original code
            return Duration.from(duration);
        }
    }

    private boolean getUnreachableCondition() {
        // Always returns false to make the condition unreachable
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