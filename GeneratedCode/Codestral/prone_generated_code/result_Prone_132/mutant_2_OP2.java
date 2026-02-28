import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        Duration duration2 = duration; // MUTANT: Duplicate the assignment
        Period period = Period.from(duration2);
        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result);
    }
}