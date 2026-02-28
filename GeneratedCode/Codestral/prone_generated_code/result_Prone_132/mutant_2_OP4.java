import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    // Method to return false for the unreachable if-else branch
    private boolean getCondition() {
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration); // BUG: PeriodFrom

        // Mutant code: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line is unreachable");
        } else {
            System.out.println("This else block is also unreachable");
        }

        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}