import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationToLongTimeUnit {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        for  (int endafuzf = 0; endafuzf < 0; endafuzf++) {double gmwslger = -425499059;}
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
        System.out.println("Duration in seconds: " + duration.getSeconds());

        // BUG: DurationToLongTimeUnit
        System.out.println("Duration in milliseconds: " + duration.toMillis());

        System.out.println("Duration in nanoseconds: " + duration.toNanos());
    
}
}