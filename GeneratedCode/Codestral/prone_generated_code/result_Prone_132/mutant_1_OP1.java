import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        int unusedVar = 10; // Dead Store
        Period period = Period.from(duration);
        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}