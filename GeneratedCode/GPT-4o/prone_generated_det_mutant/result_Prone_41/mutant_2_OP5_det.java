import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            int texztrez = 0;switch  (texztrez) {case 1:char jplszkzt = 'r';break;default:int psdrejli = -948210304;break;}
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    
}

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}