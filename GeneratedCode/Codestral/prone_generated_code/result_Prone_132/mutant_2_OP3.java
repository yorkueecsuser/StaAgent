import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    private boolean getFalseCondition() { // Non-final method that returns false
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration);

        // The mutant code added according to the 'Unreachable if statement' operator
        if (getFalseCondition()) {
            // This code will never be executed due to the getFalseCondition() method always returning false
            System.out.println("This is an unreachable code block");
        }

        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}