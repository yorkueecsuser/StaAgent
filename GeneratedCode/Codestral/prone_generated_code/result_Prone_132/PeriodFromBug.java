import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        Period period = Period.from(duration); // BUG: PeriodFrom
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        }
        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}