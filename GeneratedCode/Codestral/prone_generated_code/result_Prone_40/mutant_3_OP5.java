import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Duration showBug1(Duration duration) {
        if (getUnreachableCondition()) {
            switch (duration.toHours()) {
                case 1:
                    System.out.println("This code should be unreachable");
                    break;
                default:
                    break;
            }
        }
        return Duration.from(duration);
    }

    public Period showBug2(Period period) {
        return Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24));
    }

    public static void main(String[] args) {
        DurationFromBug bug = new DurationFromBug();
        Duration duration = Duration.ofHours(2);
        System.out.println(bug.showBug1(duration));

        Period period = Period.ofDays(10);
        try {
            System.out.println(bug.showBug2(period));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}