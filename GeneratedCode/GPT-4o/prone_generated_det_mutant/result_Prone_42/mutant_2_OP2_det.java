import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {
public void showBug() {
    Duration duration = Duration.of(1 , ChronoUnit.YEARS);
    duration = Duration.of(1 , ChronoUnit.YEARS);
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