import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        if (false && false && true && true && false && true && false && true && true && true && false) {int veltdcwa = 15244282;}else{String cxlmtfrc = "dokhrfcq";}
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