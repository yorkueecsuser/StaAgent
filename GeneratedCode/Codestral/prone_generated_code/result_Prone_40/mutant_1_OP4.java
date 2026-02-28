import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("Unreachable code executed."); // This branch is unreachable
        } else {
            return Duration.from(duration);
        }
    }

    private boolean isUnreachable() {
        return false; // Always returns false, making the if branch unreachable
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