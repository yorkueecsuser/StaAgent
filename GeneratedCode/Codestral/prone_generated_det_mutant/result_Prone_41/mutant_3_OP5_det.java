import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        int vrvlukje = 0;switch  (vrvlukje) {case 1:boolean cvpapndl = false;break;default:long dhkcimig = -170935612;break;}
        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        return duration;
    
}

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}