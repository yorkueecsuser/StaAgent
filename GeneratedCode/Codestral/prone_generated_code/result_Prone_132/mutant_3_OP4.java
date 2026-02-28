import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        Period period = Period.from(duration); // BUG: PeriodFrom

        if (isUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("Unreachable code");
        } else {
            // This branch is always executed
            System.out.println("Reachable code");
        }

        return period;
    }

    public static boolean isUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}