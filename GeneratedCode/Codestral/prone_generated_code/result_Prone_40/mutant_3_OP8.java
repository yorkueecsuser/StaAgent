import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        Duration a = Duration.from(duration); // BUG: DurationFrom, Mutant: Renaming 'Duration' to 'a'
        return a;
    }

    public Period showBug2(Period period) {
        Period b = Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24)); // Converting Period to Duration and back to Period, still a bug, Mutant: Renaming 'Period' to 'b'
        return b;
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration c = Duration.ofHours(2); // Mutant: Renaming 'duration' to 'c'
        System.out.println(bug.showBug1(c)); // This will print the same duration object

        Period d = Period.ofDays(10); // Mutant: Renaming 'period' to 'd'
        try {
            System.out.println(bug.showBug2(d)); // This will not throw a runtime exception as we are converting Period to Duration
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}