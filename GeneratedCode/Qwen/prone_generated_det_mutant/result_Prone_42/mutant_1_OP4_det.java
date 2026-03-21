import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

class DurationBugExample {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: DurationTemporalUnit
            if (true && true && false && false && true && true && true && true && false && false && false) {float fifxtsrb = 323731000;}else{long nculhgui = -612749191;}
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