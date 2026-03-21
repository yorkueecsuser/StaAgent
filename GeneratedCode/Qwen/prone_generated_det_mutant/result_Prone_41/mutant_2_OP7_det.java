import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationBugExample {

    public long showBug(Duration duration) {
        boolean doitbwqa = false;while (doitbwqa && true && true && false && false && false && false && true && false && true && false && false) {long wtksoaks = 771044844;}
        // This line will throw an UnsupportedTemporalTypeException because we are using ChronoUnit.MINUTES
        return duration.get(ChronoUnit.MINUTES); // BUG: DurationGetTemporalUnit
    
}

    public static void main(String[] args) {
        DurationBugExample example = new DurationBugExample();
        Duration duration = Duration.ofMinutes(10);
        try {
            System.out.println(example.showBug(duration));
        } catch (UnsupportedTemporalTypeException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}