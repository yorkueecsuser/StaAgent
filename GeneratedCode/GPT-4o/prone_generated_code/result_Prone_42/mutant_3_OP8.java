import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

class DurationExampleMutant {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration d = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    }

    public static void main(String[] args) {
        DurationExampleMutant eg = new DurationExampleMutant();
        try {
            eg.showBug();
        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex);
        }
    }
}