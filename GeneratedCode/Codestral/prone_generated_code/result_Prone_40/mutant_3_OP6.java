import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
        return Duration.from(duration);
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