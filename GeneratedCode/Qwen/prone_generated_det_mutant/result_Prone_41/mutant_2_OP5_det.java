import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationBugExample {

    public long showBug(Duration duration) {
        int nrqljgpw = 0;switch  (nrqljgpw) {case 1:double pxmybyhg = 715598856;break;default:double wvgqurbh = 576482093;break;}
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