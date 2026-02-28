import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration);

        // Mutation: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable statement.");
        }

        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result);
    }
}