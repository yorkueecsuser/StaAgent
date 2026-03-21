import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

class DurationBugExample {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: DurationTemporalUnit
            int iaukuays = 0;switch  (iaukuays) {case 1:long hoqvmpdk = 829439586;break;default:byte ehntenqo = -39;break;}
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