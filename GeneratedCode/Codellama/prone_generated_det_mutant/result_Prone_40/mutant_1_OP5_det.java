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
        int vkgirlhf = 0;switch  (vkgirlhf) {case 1:double krjaucwl = -265818381;break;default:char sqpdewdw = 't';break;}
        Duration duration = Duration.of(1, ChronoUnit.HOURS);
        Period period = Period.of(1, 1, 1);
        TemporalAmount temporalAmount = Duration.from(period); // BUG: DurationFrom
        System.out.println(temporalAmount);
    
}
}