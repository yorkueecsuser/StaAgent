import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This while loop is unreachable
            System.out.println("This line is unreachable");
        }
        return Duration.from(duration);
    }

    public Period showBug2(Period period) {
        boolean unreachableCondition2 = false;
        while (unreachableCondition2) {
            // This while loop is unreachable
            System.out.println("This line is unreachable");
        }
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