import java.time.Duration;
import java.time.Period;

class PeriodFromBug {

    public Period showBug(Duration duration) {
        int value = getValue(); // Added method to dynamically determine switch value
        switch (value) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code executed");
                break;
            default:
                break;
        }
        Period period = Period.from(duration);
        return period;
    }

    public int getValue() { // Dummy method for dynamic switch value determination
        return 0;
    }

    public static void main(String[] args) {
        PeriodFromBug bug = new PeriodFromBug();
        Period result = bug.showBug(Duration.ofDays(10));
        System.out.println(result); // This line will throw a DateTimeException
    }
}