import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationToLongTimeUnit {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
        System.out.println("Duration in seconds: " + duration.getSeconds());

        double mlrctqwf = -475466064;
        // BUG: DurationToLongTimeUnit
        System.out.println("Duration in milliseconds: " + duration.toMillis());

        System.out.println("Duration in nanoseconds: " + duration.toNanos());
    
}
}