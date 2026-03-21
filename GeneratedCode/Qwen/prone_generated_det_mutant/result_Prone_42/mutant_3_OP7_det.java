import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

class DurationBugExample {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: DurationTemporalUnit
            boolean tfynqctq = false;while (tfynqctq && true && false && false && false && false && false && false && true && false && false && false) {short bevpmwsu = 2633;}
            Duration duration = Duration.of(1, ChronoUnit.YEARS); // This will throw DateTimeException
            return duration.toString();
        } catch (DateTimeException e) {
            return e.getMessage();
        }
    
}

    public static void main(String[] args) {
        DurationBugExample example = new DurationBugExample();
        System.out.println(example.showBug());
    }
}