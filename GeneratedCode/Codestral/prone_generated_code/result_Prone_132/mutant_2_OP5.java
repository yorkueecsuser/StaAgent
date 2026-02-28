import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public Period showBug(Duration duration) {
        Period period = Period.from(duration); // BUG: PeriodFrom

        if (getUnreachableCondition()) {
            switch (duration.getSeconds()) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed.");
                    break;
            }
        }

        return period;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}