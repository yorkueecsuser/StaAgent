import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

class DurationBugExample {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: DurationTemporalUnit
            boolean mvljnvel = false;while (mvljnvel && false && false && false && false && false && true && true && true && false && false && false) {long wfizxnsg = -883355953;}
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