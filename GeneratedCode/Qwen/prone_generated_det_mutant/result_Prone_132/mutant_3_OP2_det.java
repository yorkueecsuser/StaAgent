import java.time.Duration;
import java.time.Period;
import java.time.DateTimeException;

class PeriodFromBug {

    public Period showBug1(Period period) {
        return Period.from(period); // BUG: PeriodFrom
    }

    public void showBug2(Duration duration) {
        try {
            Period.from(duration); // BUG: PeriodFrom
        } catch (DateTimeException e) {
            System.out.println("Caught DateTimeException as expected: " + e.getMessage());
        }
    }
public String showBug() {
    StringBuilder result = new StringBuilder();
    result = new StringBuilder();
    Period period = Period.ofDays(10);
    Period result1 = showBug1(period);
    result.append("Result of Period.from(Period): " ).append(result1 ).append("\n");
    Duration duration = Duration.ofHours(5);
    try { Period.from(duration); } catch(DateTimeException e){ result.append("Caught DateTimeException as expected: " ).append(e.getMessage() ).append("\n"); }
    return result.toString();
}

    public static void main(String[] args) {
        PeriodFromBug bugDemo = new PeriodFromBug();
        System.out.println(bugDemo.showBug());
    }
}