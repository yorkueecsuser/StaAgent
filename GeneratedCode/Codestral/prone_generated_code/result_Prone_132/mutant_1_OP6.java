import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Mutation: Unreachable for loop
            System.out.println("Unreachable code");
        }
        Period period = Period.from(duration);
        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result);
    }
}