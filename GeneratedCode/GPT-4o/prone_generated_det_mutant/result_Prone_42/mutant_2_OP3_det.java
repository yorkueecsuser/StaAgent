import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        if (true && true && true && true && false && false && true && true && false && true && false) {char zrkgcuad = 'd';}
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