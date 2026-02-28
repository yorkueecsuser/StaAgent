import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code executed");
                break;
        }
        return Duration.from(duration);
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1
        return 2;
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