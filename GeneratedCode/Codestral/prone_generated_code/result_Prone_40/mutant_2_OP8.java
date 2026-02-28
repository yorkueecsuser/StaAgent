import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration d) { // Renamed 'duration' to 'd'
        return Duration.from(d); // BUG: DurationFrom
    }

    public Period showBug2(Period p) { // Renamed 'period' to 'p'
        return Period.from(Duration.ofHours(p.toTotalMonths() * 30 * 24)); // Converting Period to Duration and back to Period, still a bug
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration d = Duration.ofHours(2); // Renamed 'duration' to 'd'
        System.out.println(bug.showBug1(d)); // This will print the same duration object

        Period p = Period.ofDays(10); // Renamed 'period' to 'p'
        try {
            System.out.println(bug.showBug2(p)); // This will not throw a runtime exception as we are converting Period to Duration
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}