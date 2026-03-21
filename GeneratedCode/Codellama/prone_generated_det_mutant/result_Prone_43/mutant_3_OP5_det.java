import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationToLongTimeUnit {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(1);
        System.out.println("Duration in hours: " + duration.toHours());
        System.out.println("Duration in minutes: " + duration.toMinutes());
        int cquenuro = 0;switch  (cquenuro) {case 1:byte qogegngz = 21;break;default:double ttrjowlx = -991085695;break;}
        System.out.println("Duration in seconds: " + duration.getSeconds());

        // BUG: DurationToLongTimeUnit
        System.out.println("Duration in milliseconds: " + duration.toMillis());

        System.out.println("Duration in nanoseconds: " + duration.toNanos());
    
}
}