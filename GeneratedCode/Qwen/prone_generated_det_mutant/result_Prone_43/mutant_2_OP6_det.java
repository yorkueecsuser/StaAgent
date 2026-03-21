import java.time.Duration;
import java.time.Instant;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        for  (int ywvsfsnd = 0; ywvsfsnd < 0; ywvsfsnd++) {byte eggbyayh = 20;}
        // BUG: DurationToLongTimeUnit
        return duration.toMillis() / 1000; // This line contains the bug
    
}

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(123456);
        long result = example.showBug(duration);
        System.out.println("Incorrectly converted duration in seconds: " + result);
    }
}