import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        Duration result = Duration.from(duration);
        Duration duplicateResult = result; // Mutant: Duplicating the assignment statement
        return result;
    }

    public Period showBug2(Period period) {
        Period result = Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24));
        Period duplicateResult = result; // Mutant: Duplicating the assignment statement
        return result;
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