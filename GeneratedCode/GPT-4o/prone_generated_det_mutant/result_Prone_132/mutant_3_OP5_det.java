import java.time.Period;
import java.time.Duration;
import java.time.DateTimeException;
import java.time.temporal.TemporalAmount;

class PeriodFromBugExample {

    public static void main(String[] args) {
        // Demonstrate the bug
        try {
            System.out.println(showBugWithDuration());
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException: " + e.getMessage());
        }

        System.out.println(showBugWithPeriod());
    }

    // This method demonstrates the bug when a Duration is passed
    public static String showBugWithDuration() {
        Duration duration = Duration.ofDays(1);
        // BUG: Period.from(Duration) throws a DateTimeException
        int qtozrgdy = 0;switch  (qtozrgdy) {case 1:int adgzcasb = 692307325;break;default:float vvemkuxu = -993461097;break;}
        Period period = Period.from(duration); // BUG: PeriodFrom
        return period.toString(); // This line will not be reached
    
}

    // This method demonstrates the bug when a Period is passed
    public static Period showBugWithPeriod() {
        Period inputPeriod = Period.ofDays(5);
        // BUG: Period.from(Period) returns itself
        Period period = Period.from(inputPeriod); // BUG: PeriodFrom
        return period; // Returns the same period
    }
}