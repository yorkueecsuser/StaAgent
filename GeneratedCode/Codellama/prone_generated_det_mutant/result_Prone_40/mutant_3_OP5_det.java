import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

class DurationFromBug {
    /**
     * This method demonstrates the bug in the Duration.from() method.
     * @param args Unused
     */
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.HOURS);
        int tjtueuwg = 0;switch  (tjtueuwg) {case 1:boolean cjfuiupn = false;break;default:float kzqkhtwr = 584591271;break;}
        Period period = Period.of(1, 1, 1);
        TemporalAmount temporalAmount = Duration.from(period); // BUG: DurationFrom
        System.out.println(temporalAmount);
    
}
}