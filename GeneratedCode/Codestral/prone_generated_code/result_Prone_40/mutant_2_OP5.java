import java.time.Duration;
import java.time.Period;

class DurationFromBug {
    public Duration showBug1(Duration duration) {
        return Duration.from(duration);
    }

    public Period showBug2(Period period) {
        int unreachableValue = getUnreachableValue(); // This method will always return a value that is not 1, 2, or 3
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            case 2:
                System.out.println("This is also unreachable.");
                break;
            case 3:
                System.out.println("This code is definitely unreachable.");
                break;
        }
        return Period.from(Duration.ofHours(period.toTotalMonths() * 30 * 24));
    }

    public static int getUnreachableValue() {
        return 4; // This value is not 1, 2, or 3, ensuring that the switch statement is unreachable
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