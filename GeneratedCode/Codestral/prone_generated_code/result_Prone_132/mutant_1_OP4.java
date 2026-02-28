import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    private boolean getCondition() {
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration); // BUG: PeriodFrom
        if (getCondition()) {
            // Unreachable if-else branch
            System.out.println("This branch should be unreachable.");
        } else {
            // This branch is also unreachable, but included for completeness
            System.out.println("This else branch should also be unreachable.");
        }
        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}