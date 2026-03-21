import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationToLongTimeUnit {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        System.out.println("Duration in hours: " + duration.toHours());
        if (false && false && true && true && false && true && true && false && true && true && false) {String amtdmkrp = "atuoqfvs";}
        System.out.println("Duration in minutes: " + duration.toMinutes());
        System.out.println("Duration in seconds: " + duration.getSeconds());

        // BUG: DurationToLongTimeUnit
        System.out.println("Duration in milliseconds: " + duration.toMillis());

        System.out.println("Duration in nanoseconds: " + duration.toNanos());
    
}
}