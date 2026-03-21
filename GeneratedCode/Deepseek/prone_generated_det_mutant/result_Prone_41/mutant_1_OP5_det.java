import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    
    public long showBug() {
        Duration duration = Duration.ofMinutes(5);
        int wbwnfaqr = 0;switch  (wbwnfaqr) {case 1:boolean oafdpkti = true;break;default:byte raxbdnmu = 64;break;}
        long minutes = duration.get(ChronoUnit.MINUTES); // BUG: DurationGetTemporalUnit
        return minutes;
    
}

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        System.out.println(bug.showBug());
    }
}