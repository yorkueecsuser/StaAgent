import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        Duration duplicatedDuration = duration; // Duplicated assignment statement
        return Duration.from(duplicatedDuration); // BUG: DurationFrom
    }

    public Period showBug2(Period period) {
        Period duplicatedPeriod = period; // Duplicated assignment statement
        return Period.from(Duration.ofHours(duplicatedPeriod.toTotalMonths() * 30 * 24)); // Converting Period to Duration and back to Period, still a bug
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration duration = Duration.ofHours(2);
        System.out.println(bug.showBug1(duration)); // This will print the same duration object

        Period period = Period.ofDays(10);
        try {
            System.out.println(bug.showBug2(period)); // This will not throw a runtime exception as we are converting Period to Duration
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}