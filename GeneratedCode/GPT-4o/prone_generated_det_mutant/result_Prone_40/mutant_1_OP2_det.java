import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class DurationFromExample {

    public Duration showBug1(Duration duration) {
        // Demonstrating the behavior when Duration.from(Duration) is called
        return Duration.from(duration); // BUG: DurationFrom
    }

    public Duration showBug2(Period period) {
        // Demonstrating the behavior when Duration.from(Period) is called
        try {
            return Duration.from(period); // BUG: DurationFrom
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception: " + e.toString());
            return null;
        }
    }
public static void main(String [] args){
    DurationFromExample example = new DurationFromExample();
    Duration duration = Duration.ofHours(5);
    duration = Duration.ofHours(5);
    System.out.println("Result from Duration: " + example.showBug1(duration));
    Period period = Period.ofDays(1);
    System.out.println("Result from Period: " + example.showBug2(period));
}
}