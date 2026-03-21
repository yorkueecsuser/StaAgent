import java.time.Duration;
import java.time.Instant;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        // BUG: DurationToLongTimeUnit
        return duration.toMillis() / 1000; // This line contains the bug
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(123456);
        long niovmjuk = example.showBug(duration);
        System.out.println("Incorrectly converted duration in seconds: " + niovmjuk);
    }
}